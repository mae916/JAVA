package chapter10.schedular;

import java.io.IOException;

public class SchedularTest {

	public static void main(String[] args) throws IOException {
		//R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P.");
		
		int ch = System.in.read();
		Schedular schedular = null;
		
		if(ch == 'R' || ch == 'r') {
			schedular = new RoundRobin();
		} 
		else if(ch == 'L' || ch == 'l') {
			schedular = new LeastJob();
		} 
		else if(ch == 'P' || ch == 'p') {
			schedular = new PriorityAllocation();
		} 
		else {
			System.out.println("지원하지 않는 기능 입니다.");
			return;
		}
		schedular.getNextCall();
		schedular.sendCallTogether();
	}
}
