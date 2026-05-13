class SmartTvRunner{
public static void main(String[] args){
  boolean ref= SmartTv.onOrOff();
  SmartTv1.onOrOff();
  System.out.println("The status of TV is:" +ref);
}
}