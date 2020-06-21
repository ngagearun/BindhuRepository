
public class StaticConcept {
	
	int accbalance=10000;
	
	void withdraw(){
		accbalance=accbalance-2000;
		System.out.println(accbalance);
	}

	public static void main(String[] args) {
		
		StaticConcept hdfc=new StaticConcept();
		hdfc.withdraw();
		
		StaticConcept sbi=new StaticConcept();
		sbi.withdraw();

	}

}
