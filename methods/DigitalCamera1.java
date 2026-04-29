class DigitalCamera1{
static String str[]={"0", "1"};
static int index=1;
static int currentPercent=120;
static int minPercent=40;
static int maxPercent=70;
static  String onOrOff(){
 	if(index==1){
		if(currentPercent>=maxPercent){
			currentPercent-=1;
			System.out.println("The camers battery percent is:" +currentPercent);
		}
		else{
			System.out.println("Min power volt");
		}
	}
	else if(index==0){
		System.out.println("The Digital camera is off");
	}
	else{
		System.out.println("The Digital camera is shutdown");
	}
	return str[index];
  }
 }