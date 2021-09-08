package chapter10.bookshelf;

public interface Queue {
	void enQueue(String title); // 맨뒤로 들어가는것(Queue 구조)
	String deQueue(); //꺼내는것(선입선출로),책의 제목을 반환
	int getSize(); // 전체 몇개의 요소를 가지고 있는지
}
