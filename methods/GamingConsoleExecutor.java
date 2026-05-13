class GamingConsoleExecutor{
 public static void main(String[] args){

  String brand = GamingConsole.getBrand();
  String model = GamingConsole.getModel();
  int storage = GamingConsole.getStorage();
  boolean vr = GamingConsole.getVRSupport();
  boolean wifi = GamingConsole.getWifi();
  boolean bluetooth = GamingConsole.getBluetooth();
  String color = GamingConsole.getColor();
  int controllers = GamingConsole.getControllers();
  double price = GamingConsole.getPrice();
  int warranty = GamingConsole.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Model: "+model);
  System.out.println("Storage: "+storage+" GB");
  System.out.println("VR Support: "+vr);
  System.out.println("WiFi: "+wifi);
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("Color: "+color);
  System.out.println("Controllers: "+controllers);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
