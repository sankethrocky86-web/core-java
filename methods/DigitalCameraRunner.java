class DigitalCameraRunner{
public static void main(String[] args){
	String ref=DigitalCamera.onOrOff();
	DigitalCamera1.onOrOff();
	System.out.println("The status of camera is:" +ref);
}
}