public class App{
  public static void main(String[] args) {
    NetworkPrinterProxy np = new NetworkPrinterProxy();

    User buh = new User(OfficeEnvironment);
    buh.receiveByMailPages();
    buh.sendToPrint();

    User manager = new User(OfficeEnvironment);
    buh.receiveByMailPages();
    buh.sendToPrint();

    //other users.sendToPrint


  }
}
