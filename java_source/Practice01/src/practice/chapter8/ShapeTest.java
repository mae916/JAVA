package practice.chapter8;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[]args) {
		ArrayList<Shape>list = new ArrayList<Shape>();
		
		list.add(new Circle()); //위에서 Shape자료형인 list에 add()를 해줬기 때문에 Shape자료형으로 업캐스팅 됨.
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) { // 이 예제의 경우 메서드 명이 다 같아서 각각 다운캐스팅 해주지 않아도 되나봄. 각각 원래 자료형의 메서드를 불러야 하기 때문에 다운캐스팅을 해줘야함. (업캐스팅된 Shape자료형에서는 하위 클래스의 메서드가 보이지 않기 때문)
			s.draw();
			
			/*
			if(s instanceof Circle) { //왼쪽변수(s)의 원래 인스턴스 형이 오른쪽변수(Circle)인지 확인함. 참이면 아래 코드를 실행.
				Circle c = (Circle)s;
				c.draw();
			} else if (s instanceof Triangle) { 
				Triangle t = (Triangle)s;
				t.draw();
			} else {
				s.draw();
			}
			*/
		}
	}
}
