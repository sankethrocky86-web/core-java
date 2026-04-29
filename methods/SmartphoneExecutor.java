class SmartphoneExecutor{
 public static void main(String[] args){

  String brand = Smartphone.getBrand();
  String os = Smartphone.getOS();
  int camera = Smartphone.getCamera();
  int battery = Smartphone.getBattery();
  int ram = Smartphone.getRAM();
  int storage = Smartphone.getStorage();
  boolean fiveG = Smartphone.get5G();
  double screen = Smartphone.getScreenSize();
  String color = Smartphone.getColor();
  double price = Smartphone.getPrice();

  System.out.println("Brand: "+brand);
  System.out.println("Operating System: "+os);
  System.out.println("Camera: "+camera+" MP");
  System.out.println("Battery: "+battery+" mAh");
  System.out.println("RAM: "+ram+" GB");
  System.out.println("Storage: "+storage+" GB");
  System.out.println("5G Support: "+fiveG);
  System.out.println("Screen Size: "+screen+" inch");
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
 }
}
