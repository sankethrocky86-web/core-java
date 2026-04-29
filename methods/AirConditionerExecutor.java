class AirConditionerExecutor{
 public static void main(String[] args){

  String brand = AirConditioner.getBrand();
  double ton = AirConditioner.getTonnage();
  int star = AirConditioner.getStarRating();
  boolean inverter = AirConditioner.getInverter();
  boolean wifi = AirConditioner.getWifi();
  String mode = AirConditioner.getMode();
  int power = AirConditioner.getPowerConsumption();
  String color = AirConditioner.getColor();
  double price = AirConditioner.getPrice();
  int warranty = AirConditioner.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Tonnage: "+ton+" Ton");
  System.out.println("Star Rating: "+star);
  System.out.println("Inverter: "+inverter);
  System.out.println("WiFi: "+wifi);
  System.out.println("Mode: "+mode);
  System.out.println("Power Consumption: "+power+" W");
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
