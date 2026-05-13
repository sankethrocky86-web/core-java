class PortableProjector1{
static byte by[]={2,4};
static int index=1;
static int currentPercent=130;
static int minPercent=40;
static int maxPercent=70;
static byte moveOrNotMove(){
	if(index==1){
		if(currentPercent>=maxPercent){
			currentPercent-=1;
			System.out.println("The projector battery percent is:" +currentPercent);
		}
		else{
			System.out.println("Min power volt");
		}
	}
	else if(index==0){
		System.out.println("The projector is off");
	}
	else{
		System.out.println("The projector is shutdown");
	}
	return by[index];
}
}