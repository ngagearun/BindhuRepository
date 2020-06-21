import java.util.Scanner;


public class Parameterisation {
	
	int sum=100;

	void addition(int num1,int num2){
		sum=num1+num2;
		System.out.println(sum);
	}
	
	String displayvalue(){
		
		return "arun";
	}
	 
 
	
	public static void main(String[] args) {
		
		Parameterisation parameter=new Parameterisation();
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		String c=parameter.displayvalue();
		parameter.addition(num1,num2);
		//parameter.addition(300,400);
		//parameter.addition(500,400);

	}

}
