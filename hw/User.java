public class User{

  protected OfficeEnvironment oe;

  User(OfficeEnvironment oe){
    this.oe = oe;
    ...
  }
  Pages receiveByMailPages(){
    ...
  };
  Pages sendToPrint(){
    this.os.getPrinter.print(oe.getReceivedPages());
  };
}
