package chapter6.coorperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money; //가지고 있는 돈 
	}
	
	public void takeBus(Bus bus) { //버스를 타면 돈(1000원)이 나간다., 객체의 협업이 일어나는 부분
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + " 입니다.");
	}
}
