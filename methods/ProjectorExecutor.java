class ProjectorExecutor{
 public static void main(String[] args){

  String brand = Projector.getBrand();
  int lumens = Projector.getLumens();
  String resolution = Projector.getResolution();
  boolean wifi = Projector.getWifi();
  int lampLife = Projector.getLampLife();
  boolean hdmi = Projector.getHDMI();
  boolean portable = Projector.getPortable();
  String color = Projector.getColor();
  double price = Projector.getPrice();
  int warranty = Projector.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Lumens: "+lumens);
  System.out.println("Resolution: "+resolution);
  System.out.println("WiFi: "+wifi);
  System.out.println("Lamp Life: "+lampLife+" hrs");
  System.out.println("HDMI: "+hdmi);
  System.out.println("Portable: "+portable);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
