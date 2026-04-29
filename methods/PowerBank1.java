class PowerBank1{
static int isBank=1;
static int currentVolt=130;
static int minVolt=20;
static int maxVolt=50;
static int getDetails(){
	if(isBank==1){
		if(currentVolt>=maxVolt){
			currentVolt-=1;
			System.out.println("The power bank volt is decreased:" +currentVolt);
		}
		else{
			System.out.println("Min power volt");
		}
	}
	else if(isBank==0){
		System.out.println("The power bank is off");
	}
	else{
		System.out.println("The power bank is shutdown");
	}
   return isBank;
  }
 }