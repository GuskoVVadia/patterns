public class NetworkPrinterProxy implements Printer{
  private NetworkPrinter np;
  //абстрактная реализация сетевой очереди
  private Queue<Pages> networkQueue = new Quequ<Pages>;

  // fields
  // other methods

  public void print(Pages p){
     //отправка в хвост односторонней очереди страницы пользователя

     // изъятие из головы очереди страниц, если очередь не пуста
     this.np.print(currentPages cp);
  }

}
