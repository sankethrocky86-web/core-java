class VoiceTranslatorEarbuds1{
static boolean Earbuds=true;
static int currentBudsBattery=130;
static int minBudsBattery=40;
static int maxBudsBattery=50;
static boolean workOrNotWork(){
	if(Earbuds==true){
		if(currentBudsBattery>=maxBudsBattery){
			currentBudsBattery-=1;
			System.out.println("Buds Battery status:" +currentBudsBattery);
	}
	}
	else if(Earbuds==false){
		System.out.println("Buds not works");
	}
   return Earbuds;
  }
}