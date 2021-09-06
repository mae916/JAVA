package AloneCoding.chapter6;

public class TakeTaxi {
	public static void main(String[]args) {
		Student student = new Student("Edward", 30000);
		
		Taxi taxi = new Taxi(1234);
		
		student.takeTaxi(taxi);
		
		taxi.showInfo();
		student.showInfo();
	}
}
