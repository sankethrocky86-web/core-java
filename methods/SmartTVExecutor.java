class SmartTVExecutor{
 public static void main(String[] args){

  String brand = SmartTV.getBrand();
  int size = SmartTV.getSize();
  String resolution = SmartTV.getResolution();
  boolean wifi = SmartTV.getWifi();
  int hdmi = SmartTV.getHDMI();
  boolean bluetooth = SmartTV.getBluetooth();
  String os = SmartTV.getOS();
  boolean hdr = SmartTV.getHDR();
  double price = SmartTV.getPrice();
  int warranty = SmartTV.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Screen Size: "+size+" inch");
  System.out.println("Resolution: "+resolution);
  System.out.println("WiFi: "+wifi);
  System.out.println("HDMI Ports: "+hdmi);
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("Operating System: "+os);
  System.out.println("HDR Support: "+hdr);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
