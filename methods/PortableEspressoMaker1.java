class PortableEspressoMaker1{
static long ln=123;
static int currentHeat=130;
static int minHeat=40;
static int maxHeat=70;
static long carryOrNotCarry(){
	if(ln==123){
		if(currentHeat>=maxHeat){
			currentHeat-=1;
		    System.out.println("Higher heat value:" +currentHeat);
	}
	}
	else if(ln==234){
		System.out.println("Not Carriable");
	}
	else{
		System.out.println("Not working");
	}
	return ln;
 
 }
}