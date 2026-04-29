class ElectricKettleExecutor{
 public static void main(String[] args){

  String brand = ElectricKettle.getBrand();
  int capacity = ElectricKettle.getCapacity();
  int power = ElectricKettle.getPower();
  boolean autoCut = ElectricKettle.getAutoCut();
  boolean protection = ElectricKettle.getDryBoilProtection();
  String material = ElectricKettle.getMaterial();
  String color = ElectricKettle.getColor();
  boolean cordless = ElectricKettle.getCordless();
  double price = ElectricKettle.getPrice();
  int warranty = ElectricKettle.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Capacity: "+capacity+" L");
  System.out.println("Power: "+power+" W");
  System.out.println("Auto Cut Off: "+autoCut);
  System.out.println("Dry Boil Protection: "+protection);
  System.out.println("Material: "+material);
  System.out.println("Color: "+color);
  System.out.println("Cordless: "+cordless);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
