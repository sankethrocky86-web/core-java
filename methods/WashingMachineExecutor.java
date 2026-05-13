class WashingMachineExecutor{
 public static void main(String[] args){

  String brand = WashingMachine.getBrand();
  int capacity = WashingMachine.getCapacity();
  String type = WashingMachine.getType();
  int speed = WashingMachine.getSpinSpeed();
  boolean heater = WashingMachine.getHeater();
  int programs = WashingMachine.getPrograms();
  boolean wifi = WashingMachine.getWifi();
  double price = WashingMachine.getPrice();
  int warranty = WashingMachine.getWarranty();
  String color = WashingMachine.getColor();

  System.out.println("Brand: "+brand);
  System.out.println("Capacity: "+capacity+" Kg");
  System.out.println("Type: "+type);
  System.out.println("Spin Speed: "+speed+" RPM");
  System.out.println("Heater: "+heater);
  System.out.println("Programs: "+programs);
  System.out.println("WiFi: "+wifi);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
  System.out.println("Color: "+color);
 }
}
