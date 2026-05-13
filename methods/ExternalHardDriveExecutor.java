class ExternalHardDriveExecutor{
 public static void main(String[] args){

  String brand = ExternalHardDrive.getBrand();
  int storage = ExternalHardDrive.getStorage();
  String inter = ExternalHardDrive.getInterface();
  boolean portable = ExternalHardDrive.getPortable();
  String color = ExternalHardDrive.getColor();
  boolean shock = ExternalHardDrive.getShockProof();
  int weight = ExternalHardDrive.getWeight();
  boolean encrypt = ExternalHardDrive.getEncryption();
  double price = ExternalHardDrive.getPrice();
  int warranty = ExternalHardDrive.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Storage: "+storage+" GB");
  System.out.println("Interface: "+inter);
  System.out.println("Portable: "+portable);
  System.out.println("Color: "+color);
  System.out.println("Shock Proof: "+shock);
  System.out.println("Weight: "+weight+" g");
  System.out.println("Encryption: "+encrypt);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
