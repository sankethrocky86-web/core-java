class MicrowaveExecutor{
 public static void main(String[] args){

  String brand = Microwave.getBrand();
  int capacity = Microwave.getCapacity();
  int power = Microwave.getPower();
  boolean grill = Microwave.getGrill();
  boolean convection = Microwave.getConvection();
  String color = Microwave.getColor();
  int menus = Microwave.getAutoMenus();
  boolean lock = Microwave.getChildLock();
  double price = Microwave.getPrice();
  int warranty = Microwave.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Capacity: "+capacity+" L");
  System.out.println("Power: "+power+" W");
  System.out.println("Grill: "+grill);
  System.out.println("Convection: "+convection);
  System.out.println("Color: "+color);
  System.out.println("Auto Menus: "+menus);
  System.out.println("Child Lock: "+lock);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
