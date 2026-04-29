class SpeakerRunner1{
	static int minVolume=9;
	static int maxVolume=8;
	static boolean isConnected=false;
	
static boolean decreaseDetails(){
	if(isConnected==true){
		System.out.println("The speaker is connected");
		if(minVolume>=maxVolume){
				minVolume-=1;
				System.out.println("The current volume of speaker is:" +minVolume);
		}
		else{
			System.out.println("Speaker is in Min volume");
		}
	}
	else {
		System.out.println("The speaker is not connected");
		}
	return isConnected;
  
}
 
public static void main(String[] args){
	SpeakerRunner1.decreaseDetails();
}
}
 
