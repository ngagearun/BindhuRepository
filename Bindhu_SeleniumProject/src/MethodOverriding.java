class Bank{
	
	int roi=2;
	
	int rateofinterest(){
		
		return roi;
	}
	
	void display(){
		System.out.println(roi);
	}
}

class AXISBank extends Bank{
	
	int roi=3;
	void display(){
		System.out.println(roi);
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		AXISBank a1=new AXISBank();
		a1.display();

	}

}
