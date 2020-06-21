
 class Vehicle {
	 
	 int no_of_wwheels,lights;
	 
	 void speed(int value){
		 
		 System.out.println(value);
	 }
	 
	 

}
 
 class Car extends Vehicle{
	 
	 void display(){
		 no_of_wwheels=4;
		 lights=2;
		 speed(100);
	 }
	 
 }
 
 class Bike extends Vehicle{
	 
	 void display(){
		 no_of_wwheels=2;
		 lights=1;
		 speed(60);
	 }
	 
 }

 
 
class InheritanceTest {
	 
	 public static void main(String[] args){
		 
		 Car c=new Car();
		 c.display();
		 
		 Bike b=new Bike();
		 b.display();
	 }
 }