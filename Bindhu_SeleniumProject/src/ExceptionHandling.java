import java.io.FileInputStream;


public class ExceptionHandling {

	int division,num1=100,num2=0;
	
	void div(){
		
	 try{
		division=num1/num2;
		System.out.println(division);
	 }catch(Exception e){
		 
		 System.out.println(e.getMessage());
	 }finally{
		 
	 }
	 
	 
	}
	
	
	void display(){
		
		System.out.println("I am in display method");
	}
	
	
	public static void main(String[] args) {
	
		ExceptionHandling exception=new ExceptionHandling();
		exception.div();
		exception.display();
		
		String s="a";
		int i=Integer.parseInt(s);
		System.out.println(s.length());

	}

}
