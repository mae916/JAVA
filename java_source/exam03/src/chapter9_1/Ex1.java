package chapter9_1;

public class Ex1 {
	public static void main(String[]args) {
		AnimalMove(new Human());
		AnimalMove(new Tiger());
		AnimalMove(new Eagle());
	}
	
	public static void AnimalMove(Animal animal) {
		animal.move();
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.breads();
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
		}
	}
}
