class PrinterExecutor{
 public static void main(String[] args){

  String brand = Printer.getBrand();
  String type = Printer.getType();
  boolean color = Printer.getColorPrint();
  int speed = Printer.getSpeed();
  boolean wifi = Printer.getWifi();
  boolean duplex = Printer.getDuplex();
  int tray = Printer.getTrayCapacity();
  double price = Printer.getPrice();
  int warranty = Printer.getWarranty();
  String connectivity = Printer.getConnectivity();

  System.out.println("Printer Brand: "+brand);
  System.out.println("Printer Type: "+type);
  System.out.println("Color Printing: "+color);
  System.out.println("Print Speed: "+speed+" ppm");
  System.out.println("WiFi Support: "+wifi);
  System.out.println("Duplex Printing: "+duplex);
  System.out.println("Tray Capacity: "+tray);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
  System.out.println("Connectivity: "+connectivity);
 }
}
