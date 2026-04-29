class VacuumCleanerExecutor{
 public static void main(String[] args){

  String brand = VacuumCleaner.getBrand();
  int power = VacuumCleaner.getPower();
  boolean bagless = VacuumCleaner.getBagless();
  int dust = VacuumCleaner.getDustCapacity();
  boolean hepa = VacuumCleaner.getHEPAFilter();
  String color = VacuumCleaner.getColor();
  boolean cordless = VacuumCleaner.getCordless();
  int noise = VacuumCleaner.getNoiseLevel();
  double price = VacuumCleaner.getPrice();
  int warranty = VacuumCleaner.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Power: "+power+" W");
  System.out.println("Bagless: "+bagless);
  System.out.println("Dust Capacity: "+dust+" L");
  System.out.println("HEPA Filter: "+hepa);
  System.out.println("Color: "+color);
  System.out.println("Cordless: "+cordless);
  System.out.println("Noise Level: "+noise+" dB");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
