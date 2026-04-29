class DroneExecutor{
 public static void main(String[] args){

  String brand = Drone.getBrand();
  int flightTime = Drone.getFlightTime();
  boolean gps = Drone.getGPS();
  int camera = Drone.getCameraQuality();
  boolean obstacle = Drone.getObstacleSensor();
  int range = Drone.getRange();
  boolean returnHome = Drone.getReturnHome();
  String color = Drone.getColor();
  double price = Drone.getPrice();
  int warranty = Drone.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Flight Time: "+flightTime+" min");
  System.out.println("GPS: "+gps);
  System.out.println("Camera Quality: "+camera+"K");
  System.out.println("Obstacle Sensor: "+obstacle);
  System.out.println("Range: "+range+" km");
  System.out.println("Return Home: "+returnHome);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" year");
 }
}
