class SmartTv1{
static boolean isSwitch=true;
static int minVolume;
static int currentVolume=125;
static int maxVolume=100;
static boolean onOrOff(){
	if(isSwitch){
		if(currentVolume>=maxVolume){
			currentVolume-=1;
			System.out.println("The TV volume is decreased...");
			System.out.println("The current volume of tv is:" +currentVolume);
	}
	}
	else if(isSwitch==false){
		 System.out.println("The TV is in sleep mode");
		}
	else{
		System.out.println("Tv not working");
	}
 return isSwitch;
}

}