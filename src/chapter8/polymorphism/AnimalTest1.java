package chapter8.polymorphism;


public class AnimalTest1 {
	
	 static void main(String[] args) {
		 AnimalTest1 aTest = new AnimalTest1();
		 aTest.moveAnimal(new Human());
		 aTest.moveAnimal(new Tiger());
		 aTest.moveAnimal(new Eagle());
	 }
	 public void moveAnimal(Animal animal){
		 animal.move(); //동일한 move 메소드 사용 => 각각 다른 결과
	 }
	

}



