class RefrigeratorExecutor{
 public static void main(String[] args){

  String brand = Refrigerator.getBrand();
  int capacity = Refrigerator.getCapacity();
  int doors = Refrigerator.getDoors();
  boolean freezer = Refrigerator.getFreezer();
  int star = Refrigerator.getStarRating();
  boolean inverter = Refrigerator.getInverter();
  String color = Refrigerator.getColor();
  double price = Refrigerator.getPrice();
  int warranty = Refrigerator.getWarranty();
  boolean coolPad = Refrigerator.getCoolPad();

  System.out.println("Brand: "+brand);
  System.out.println("Capacity: "+capacity+" L");
  System.out.println("Doors: "+doors);
  System.out.println("Freezer: "+freezer);
  System.out.println("Star Rating: "+star);
  System.out.println("Inverter: "+inverter);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
  System.out.println("Cool Pad: "+coolPad);
 }
}
