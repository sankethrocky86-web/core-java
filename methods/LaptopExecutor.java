class LaptopExecutor{
 public static void main(String[] args){

  String brand=Laptop.getBrand();
  String processor=Laptop.getProcessor();
  int ram=Laptop.getRAM();
  int storage=Laptop.getStorage();
  String os=Laptop.getOS();
  int battery=Laptop.getBatteryHours();
  double weight=Laptop.getWeight();
  String color=Laptop.getColor();
  double price=Laptop.getPrice();
  int warranty=Laptop.getWarranty();

  System.out.println("Laptop Brand: "+brand);
  System.out.println("Processor: "+processor);
  System.out.println("RAM: "+ram+"GB");
  System.out.println("Storage: "+storage+"GB");
  System.out.println("Operating System: "+os);
  System.out.println("Battery Backup: "+battery+" hours");
  System.out.println("Weight: "+weight+" kg");
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
