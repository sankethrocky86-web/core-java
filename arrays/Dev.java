class Dev{
  String age; // instance variable / non-static
  
  public static void main(String[] args){
	Dev d = new Dev();
	d.age = "23";
	System.out.println(d.age);
  }
}