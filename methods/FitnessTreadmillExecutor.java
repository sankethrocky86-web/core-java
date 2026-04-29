class FitnessTreadmillExecutor{
 public static void main(String[] args){

  String brand = FitnessTreadmill.getBrand();
  int speed = FitnessTreadmill.getMaxSpeed();
  boolean incline = FitnessTreadmill.getIncline();
  int programs = FitnessTreadmill.getPrograms();
  int weight = FitnessTreadmill.getMaxWeight();
  String display = FitnessTreadmill.getDisplayType();
  boolean heart = FitnessTreadmill.getHeartRateSensor();
  String color = FitnessTreadmill.getColor();
  double price = FitnessTreadmill.getPrice();
  int warranty = FitnessTreadmill.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Max Speed: "+speed+" km/h");
  System.out.println("Incline: "+incline);
  System.out.println("Programs: "+programs);
  System.out.println("Max Weight: "+weight+" kg");
  System.out.println("Display: "+display);
  System.out.println("Heart Rate Sensor: "+heart);
  System.out.println("Color: "+color);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
