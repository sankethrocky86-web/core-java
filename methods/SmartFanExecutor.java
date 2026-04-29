class SmartFanExecutor{
 public static void main(String[] args){

  String brand = SmartFan.getBrand();
  boolean remote = SmartFan.getRemote();
  boolean app = SmartFan.getAppControl();
  int speed = SmartFan.getSpeedLevels();
  boolean timer = SmartFan.getTimer();
  int power = SmartFan.getPowerConsumption();
  String color = SmartFan.getColor();
  boolean silent = SmartFan.getSilentMode();
  double price = SmartFan.getPrice();
  int warranty = SmartFan.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Remote: "+remote);
  System.out.println("App Control: "+app);
  System.out.println("Speed Levels: "+speed);
  System.out.println("Timer: "+timer);
  System.out.println("Power Consumption: "+power+" W");
  System.out.println("Color: "+color);
  System.out.println("Silent Mode: "+silent);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
