package AloneCoding.chapter6;

public class Student {
	String sudentName;
	int money;
	
	public Student(String sudentName, int money) {
		this.sudentName = sudentName;
		this.money = money;
	}
	
	public void  takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money -= 10000;
	}
		public void showInfo() {
			System.out.println(sudentName + "¥‘¿« ¿‹æ◊¿∫ " + money + "¿‘¥œ¥Ÿ.");
		}
}
