class PowerBankExecutor{
 public static void main(String[] args){

  String brand = PowerBank.getBrand();
  int capacity = PowerBank.getCapacity();
  boolean fastCharge = PowerBank.getFastCharge();
  int ports = PowerBank.getPorts();
  String type = PowerBank.getBatteryType();
  boolean led = PowerBank.getLEDIndicator();
  String color = PowerBank.getColor();
  int weight = PowerBank.getWeight();
  double price = PowerBank.getPrice();
  int warranty = PowerBank.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Capacity: "+capacity+" mAh");
  System.out.println("Fast Charging: "+fastCharge);
  System.out.println("Ports: "+ports);
  System.out.println("Battery Type: "+type);
  System.out.println("LED Indicator: "+led);
  System.out.println("Color: "+color);
  System.out.println("Weight: "+weight+" g");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
