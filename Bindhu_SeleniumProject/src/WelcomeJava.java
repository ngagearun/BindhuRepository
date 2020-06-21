
class WelcomeJava {
	 
	//instance variables
	 int accno=132344;
	 String name="Naresh";
	 //static variable
	 static int rollno=1001;
	 
	 //non static method
	 void display(){
		
		 System.out.println(accno);
		 System.out.println(name);
		
	 }
	 
	 //static method
	 static void test(){
		 
		// System.out.println(accno);
		// System.out.println(name); 
		 System.out.println(rollno);
	 }
	
	 public static void main(String[] args){
		
		 int a=10;//local variable		 
		 System.out.println(a);
		 
		WelcomeJava welcome=new WelcomeJava();
		welcome.display();
	
		
		test();
		 
	 } 

}
