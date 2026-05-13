class SmartDoorLockExecutor{
 public static void main(String[] args){

  String brand = SmartDoorLock.getBrand();
  boolean finger = SmartDoorLock.getFingerprint();
  boolean pass = SmartDoorLock.getPassword();
  boolean app = SmartDoorLock.getMobileApp();
  boolean auto = SmartDoorLock.getAutoLock();
  String color = SmartDoorLock.getColor();
  boolean alarm = SmartDoorLock.getAlarm();
  String material = SmartDoorLock.getMaterial();
  double price = SmartDoorLock.getPrice();
  int warranty = SmartDoorLock.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Fingerprint: "+finger);
  System.out.println("Password: "+pass);
  System.out.println("Mobile App: "+app);
  System.out.println("Auto Lock: "+auto);
  System.out.println("Color: "+color);
  System.out.println("Alarm: "+alarm);
  System.out.println("Material: "+material);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
