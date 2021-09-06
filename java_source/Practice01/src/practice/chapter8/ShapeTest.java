package practice.chapter8;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[]args) {
		ArrayList<Shape>list = new ArrayList<Shape>();
		
		list.add(new Circle()); //������ Shape�ڷ����� list�� add()�� ����� ������ Shape�ڷ������� ��ĳ���� ��.
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s : list) { // �� ������ ��� �޼��� ���� �� ���Ƽ� ���� �ٿ�ĳ���� ������ �ʾƵ� �ǳ���. ���� ���� �ڷ����� �޼��带 �ҷ��� �ϱ� ������ �ٿ�ĳ������ �������. (��ĳ���õ� Shape�ڷ��������� ���� Ŭ������ �޼��尡 ������ �ʱ� ����)
			s.draw();
			
			/*
			if(s instanceof Circle) { //���ʺ���(s)�� ���� �ν��Ͻ� ���� �����ʺ���(Circle)���� Ȯ����. ���̸� �Ʒ� �ڵ带 ����.
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
