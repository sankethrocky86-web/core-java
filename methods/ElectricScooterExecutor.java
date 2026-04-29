class ElectricScooterExecutor{
 public static void main(String[] args){

  String brand = ElectricScooter.getBrand();
  int range = ElectricScooter.getRange();
  int speed = ElectricScooter.getTopSpeed();
  boolean fast = ElectricScooter.getFastCharge();
  int battery = ElectricScooter.getBatteryCapacity();
  String color = ElectricScooter.getColor();
  boolean app = ElectricScooter.getMobileApp();
  int charge = ElectricScooter.getChargingTime();
  double price = ElectricScooter.getPrice();
  int warranty = ElectricScooter.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Range: "+range+" km");
  System.out.println("Top Speed: "+speed+" km/h");
  System.out.println("Fast Charge: "+fast);
  System.out.println("Battery Capacity: "+battery+" kWh");
  System.out.println("Color: "+color);
  System.out.println("Mobile App: "+app);
  System.out.println("Charging Time: "+charge+" hrs");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
