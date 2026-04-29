class HomeTheaterExecutor{
 public static void main(String[] args){

  String brand = HomeTheater.getBrand();
  int power = HomeTheater.getOutputPower();
  boolean bluetooth = HomeTheater.getBluetooth();
  boolean hdmi = HomeTheater.getHDMI();
  int channels = HomeTheater.getChannels();
  boolean sub = HomeTheater.getSubwoofer();
  String color = HomeTheater.getColor();
  boolean remote = HomeTheater.getRemote();
  double price = HomeTheater.getPrice();
  int warranty = HomeTheater.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Output Power: "+power+" W");
  System.out.println("Bluetooth: "+bluetooth);
  System.out.println("HDMI: "+hdmi);
  System.out.println("Channels: "+channels);
  System.out.println("Subwoofer: "+sub);
  System.out.println("Color: "+color);
  System.out.println("Remote: "+remote);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
