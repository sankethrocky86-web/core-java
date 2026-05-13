class CoffeeMakerExecutor{
 public static void main(String[] args){

  String brand = CoffeeMaker.getBrand();
  int cups = CoffeeMaker.getCupCapacity();
  boolean brew = CoffeeMaker.getAutoBrew();
  boolean timer = CoffeeMaker.getTimer();
  String color = CoffeeMaker.getColor();
  int power = CoffeeMaker.getPower();
  boolean water = CoffeeMaker.getWaterLevelIndicator();
  String material = CoffeeMaker.getMaterial();
  double price = CoffeeMaker.getPrice();
  int warranty = CoffeeMaker.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Cup Capacity: "+cups);
  System.out.println("Auto Brew: "+brew);
  System.out.println("Timer: "+timer);
  System.out.println("Color: "+color);
  System.out.println("Power: "+power+" W");
  System.out.println("Water Level Indicator: "+water);
  System.out.println("Material: "+material);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
