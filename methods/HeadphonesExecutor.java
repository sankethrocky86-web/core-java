class HeadphonesExecutor{
 public static void main(String[] args){

  String brand = Headphones.getBrand();
  boolean wireless = Headphones.isWireless();
  int battery = Headphones.getBattery();
  boolean noise = Headphones.getNoiseCancel();
  String type = Headphones.getType();
  String color = Headphones.getColor();
  boolean mic = Headphones.getMic();
  String version = Headphones.getBluetoothVersion();
  int weight = Headphones.getWeight();
  double price = Headphones.getPrice();

  System.out.println("Brand: "+brand);
  System.out.println("Wireless: "+wireless);
  System.out.println("Battery Backup: "+battery+" hrs");
  System.out.println("Noise Cancellation: "+noise);
  System.out.println("Type: "+type);
  System.out.println("Color: "+color);
  System.out.println("Microphone: "+mic);
  System.out.println("Bluetooth Version: "+version);
  System.out.println("Weight: "+weight+" g");
  System.out.println("Price: "+price);
 }
}
