class WaterPurifierExecutor{
 public static void main(String[] args){

  String brand = WaterPurifier.getBrand();
  String type = WaterPurifier.getPurificationType();
  int capacity = WaterPurifier.getCapacity();
  boolean tds = WaterPurifier.getTDSControl();
  boolean shut = WaterPurifier.getAutoShutOff();
  String color = WaterPurifier.getColor();
  int power = WaterPurifier.getPower();
  boolean alert = WaterPurifier.getFilterChangeAlert();
  double price = WaterPurifier.getPrice();
  int warranty = WaterPurifier.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Purification: "+type);
  System.out.println("Capacity: "+capacity+" L");
  System.out.println("TDS Control: "+tds);
  System.out.println("Auto Shut Off: "+shut);
  System.out.println("Color: "+color);
  System.out.println("Power: "+power+" W");
  System.out.println("Filter Alert: "+alert);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
