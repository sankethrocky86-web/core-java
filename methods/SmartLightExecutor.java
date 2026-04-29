class SmartLightExecutor{
 public static void main(String[] args){

  String brand = SmartLight.getBrand();
  String type = SmartLight.getType();
  boolean wifi = SmartLight.getWifi();
  boolean voice = SmartLight.getVoiceControl();
  int watt = SmartLight.getWattage();
  String color = SmartLight.getColor();
  boolean app = SmartLight.getAppControl();
  int life = SmartLight.getLifeSpan();
  double price = SmartLight.getPrice();
  int warranty = SmartLight.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Type: "+type);
  System.out.println("WiFi: "+wifi);
  System.out.println("Voice Control: "+voice);
  System.out.println("Wattage: "+watt+" W");
  System.out.println("Color: "+color);
  System.out.println("App Control: "+app);
  System.out.println("Life Span: "+life+" hrs");
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
