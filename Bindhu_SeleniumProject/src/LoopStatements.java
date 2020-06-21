
public class LoopStatements {
	
	static void whileloop(){
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
	}
	
	static void forloop(){
		for(int i=11;i<=10;i++){
			System.out.println(i);
		}
		
		
	}
	
	static void dowhileloop(){
		int i=11;
		int b=100;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
	System.out.println(b);	
	}

	public static void main(String[] args) {
	
		 dowhileloop();
		 forloop();

	}

}
