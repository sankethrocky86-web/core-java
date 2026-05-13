class GraphicsCardExecutor{
 public static void main(String[] args){

  String brand = GraphicsCard.getBrand();
  String model = GraphicsCard.getModel();
  int vram = GraphicsCard.getVRAM();
  String mem = GraphicsCard.getMemoryType();
  boolean ray = GraphicsCard.getRayTracing();
  int clock = GraphicsCard.getClockSpeed();
  boolean hdmi = GraphicsCard.getHDMI();
  boolean dp = GraphicsCard.getDisplayPort();
  double price = GraphicsCard.getPrice();
  int warranty = GraphicsCard.getWarranty();

  System.out.println("Brand: "+brand);
  System.out.println("Model: "+model);
  System.out.println("VRAM: "+vram+" GB");
  System.out.println("Memory Type: "+mem);
  System.out.println("Ray Tracing: "+ray);
  System.out.println("Clock Speed: "+clock+" MHz");
  System.out.println("HDMI: "+hdmi);
  System.out.println("DisplayPort: "+dp);
  System.out.println("Price: "+price);
  System.out.println("Warranty: "+warranty+" years");
 }
}
