
public class MethodOverLoading {
	
	void submitform(String name,int age){				
		
		System.out.println("Name is :"+name+"Age is :"+age);
		
	}
	
	void submitform(String name,int age,char gender){
		
		System.out.println("Name is :"+name+"Age is :"+age+"gener is:"+gender);
		
	}
	
	void submitform(String name,int age,char gender,String address){
		
		System.out.println("Name is :"+name+"Age is :"+age+"gener is:"+gender+"address is:"+address);
	}
	
	void addition(int a,int b){
		
	}
	
	void addition(float a,float b){
		
	}

	public static void main(String[] args) {
	
		MethodOverLoading cus1=new MethodOverLoading();
		cus1.submitform("kumar", 30);
		
		

	}

}
