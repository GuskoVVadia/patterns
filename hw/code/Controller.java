/**
* Здесь приведён не весь код, а лишь часть, касающаяся паттерна Наблюдатель.
* Данный код взят из моего пет проекта.
 */

import AppInterfaces.*;
// ...

public class Controller implements ObservableSize, AlertMessage {
    // other fields
    private LinkedList<ObserverSize> listObserverSize;

        public Controller(){
        this.listObserverSize = new LinkedList<>();
    }

// ...

        //запуск слушателей для размерности окна
        primaryScene.widthProperty().addListener(dimensionChangeListener);
        primaryScene.heightProperty().addListener(dimensionChangeListener);

        //запуск отдельного потока обновления массива
        Thread processDimensionChangeThread = new Thread(() -> {
            while (true) {
                try {
                    dimensionChangeQueue.take();
                    notifyObservers();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });
    
    // ...
    
    @Override
    public void registerObserverSize(ObserverSize observerSize) {
        this.listObserverSize.add(observerSize);
    }

    @Override
    public void notifyObservers() {
        Platform.runLater(() -> {
            listObserverSize.forEach(o -> o.update(primaryScene.getWidth(), primaryScene.getHeight()));
        });
    }

}