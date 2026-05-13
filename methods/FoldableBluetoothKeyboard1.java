class FoldableBluetoothKeyboard1{
static double FBK=3.14d;
static int currentBattery=130;
static int minBattery=40;
static int maxBattery=50;
static double openOrClose(){
	if(FBK==3.14d){
		if(currentBattery>=maxBattery){
			currentBattery-=1;
			System.out.println("FBK battery status:" +currentBattery);
	}
	}
	else if(FBK==3.15d){
		 System.out.println("FBK is closed");
		}
	return FBK;
	}
  }