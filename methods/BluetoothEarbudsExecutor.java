class BluetoothEarbudsExecutor{
 public static void main(String[] args){

  String brand = BluetoothEarbuds.getBrand();
  int battery = BluetoothEarbuds.getBatteryLife();
  boolean noise = BluetoothEarbuds.getNoiseCancellation();
  boolean water = BluetoothEarbuds.getWaterResistant();
  String version = BluetoothEarbuds.getBluetoothVersion();
  String color = BluetoothEarbuds.getColor();
  boolean touch = BluetoothEarbuds.getTouchControls();
  int driver = BluetoothEarbuds.getDriverSize();
  double price = BluetoothEarbuds.getPrice();
  int warranty = BluetoothEarbuds.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Battery Life: "+battery+" hrs");
  System.out.println("Noise Cancellation: "+noise);
  System.out.println("Water Resistant: "+water);
  System.out.println("Bluetooth Version: "+version);
  System.out.println("Color: "+color);
  System.out.println("Touch Controls: "+touch);
  System.out.println("Driver Size: "+driver+" mm");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
