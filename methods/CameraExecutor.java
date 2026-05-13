class CameraExecutor{
 public static void main(String[] args){

  String brand = Camera.getBrand();
  int mp = Camera.getMegaPixel();
  boolean flash = Camera.getFlash();
  String lens = Camera.getLensType();
  int zoom = Camera.getZoom();
  boolean wifi = Camera.getWifi();
  boolean bluetooth = Camera.getBluetooth();
  String video = Camera.getVideoQuality();
  double price = Camera.getPrice();
  int warranty = Camera.getWarranty();

  System.out.println("Camera Brand: "+brand);
  System.out.println("MegaPixel: "+mp+" MP");
  System.out.println("Flash Available: "+flash);
  System.out.println("Lens Type: "+lens);
  System.out.println("Zoom Level: "+zoom+"x");
  System.out.println("WiFi Support: "+wifi);
  System.out.println("Bluetooth Support: "+bluetooth);
  System.out.println("Video Quality: "+video);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
