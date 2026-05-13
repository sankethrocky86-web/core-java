class San{
	static String institute = "XWORKZ"; // class variable/ static 
	
	void show(){
		int num = 10;
		System.out.println("Local Varibale ");
		System.out.println(num);
	}
	public static void main(String[] args){
		San s = new San();
		s.show();
		s.name = Rocky;
		System.out.print("Instace varibale "+ s.name);
		System.out.println("Static variable "+ San.institute);
	}

}

