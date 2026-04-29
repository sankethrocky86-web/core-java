class RouterExecutor{
 public static void main(String[] args){

  String brand = Router.getBrand();
  int speed = Router.getSpeed();
  boolean dualBand = Router.getDualBand();
  int antennas = Router.getAntennas();
  boolean parental = Router.getParentalControl();
  boolean guest = Router.getGuestNetwork();
  String frequency = Router.getFrequency();
  String color = Router.getColor();
  double price = Router.getPrice();
  int warranty = Router.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Speed: "+speed+" Mbps");
  System.out.println("Dual Band: "+dualBand);
  System.out.println("Antennas: "+antennas);
  System.out.println("Parental Control: "+parental);
  System.out.println("Guest Network: "+guest);
  System.out.println("Frequency: "+frequency);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
