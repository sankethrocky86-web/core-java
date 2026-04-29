class SpeakerDetails{
	static int currentVolume=10;
	static int minVolume;
	static int maxVolume=8;
	static boolean isConnected=true;
public static boolean increaseVolume(){
	System.out.println("The increase volume is called");
	System.out.println("No of args:" +0);
	if(isConnected==true){
		if(currentVolume < maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The current volume of speaker is:" +currentVolume);
		}
		else{
			System.out.println("Max volume is reached");
		}
	}
	else{
		 System.out.println("The speaker is not connected");
		}
		
		return isConnected;
	}

public static void main(String[] args){
	SpeakerDetails.increaseVolume();
	
}
}
