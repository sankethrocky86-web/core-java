class DigitalNotePen1{
static float f=1.0f;
static int currentBattery=130;
static int minBattery=20;
static int maxBattery=40;
static float writeNotWrite(){
	if(f==1.0f){
		if(currentBattery>=maxBattery){
			currentBattery-=1;
			System.out.println("Digital Pen Battery status is:" +currentBattery );
	}
	}
	else if(f==0.0f){
		System.out.println("Pen doesn't writes");
	}
	else{
		System.out.println("Pen damaged");
	}
	return f;
 }
}