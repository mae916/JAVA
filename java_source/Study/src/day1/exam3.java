package day1;

public class exam3 {
	public static void main(String[] args) {
		for(int dan = 11; dan <= 19; dan++) {
			for(int times = 11; times <= 19; times++) {
				if (dan > times) continue;
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
		}
	}
}
