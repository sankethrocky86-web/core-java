class HairDryerExecutor{
 public static void main(String[] args){

  String brand = HairDryer.getBrand();
  int power = HairDryer.getPower();
  int heat = HairDryer.getHeatSettings();
  int speed = HairDryer.getSpeedSettings();
  boolean cool = HairDryer.getCoolShot();
  String color = HairDryer.getColor();
  boolean fold = HairDryer.getFoldable();
  String cord = HairDryer.getCordLength();
  double price = HairDryer.getPrice();
  int warranty = HairDryer.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Power: "+power+" W");
  System.out.println("Heat Settings: "+heat);
  System.out.println("Speed Settings: "+speed);
  System.out.println("Cool Shot: "+cool);
  System.out.println("Color: "+color);
  System.out.println("Foldable: "+fold);
  System.out.println("Cord Length: "+cord);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
