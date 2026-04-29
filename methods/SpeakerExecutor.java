class SpeakerExecutor{
 public static void main(String[] args){

  String brand = Speaker.getBrand();
  int power = Speaker.getOutputPower();
  boolean bluetooth = Speaker.getBluetooth();
  int battery = Speaker.getBatteryBackup();
  boolean waterproof = Speaker.getWaterproof();
  String color = Speaker.getColor();
  double price = Speaker.getPrice();
  boolean mic = Speaker.getMic();
  String version = Speaker.getBluetoothVersion();
  int weight = Speaker.getWeight();

  System.out.println("Speaker Brand: "+brand);
  System.out.println("Output Power: "+power+" W");
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("Battery Backup: "+battery+" hrs");
  System.out.println("Waterproof: "+waterproof);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Mic Support: "+mic);
  System.out.println("Bluetooth Version: "+version);
  System.out.println("Weight: "+weight+" g");
 }
}
