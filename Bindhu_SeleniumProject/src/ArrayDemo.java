
public class ArrayDemo {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int std_marks[]={50,80,90,100};
		
		for(int i=0;i<std_marks.length;i++){
			System.out.println(std_marks[i]);
		}
			
		
		String country[]=new String[5];
		
		country[0]="India";
		country[1]="USA";
		country[2]="SouthAfrica";
		country[3]="Srilanka";
		country[4]="Japan";
		
		for(int i=0;i<=4;i++){
			System.out.println(country[i]);
		}
		
		for(int i=4;i>=0;i--){
			System.out.println(country[i]);
		}
		*/
		
		String persondetails[][]={   {"Arun","500045","345345"},
									 {"kumar","45677","234566"}						
								};
		
		String persondetails[][]=methodtoreadfromexcel();
		
		for(int row=0;row<persondetails.length;row++){
			
			for(int col=0;col<3;col++){
				System.out.println(persondetails[row][col]);
			}
		}
		
		
		
		
		
		
		
		

	}

}
