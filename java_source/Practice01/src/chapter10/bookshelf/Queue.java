package chapter10.bookshelf;

public interface Queue {
	void enQueue(String title); // �ǵڷ� ���°�(Queue ����)
	String deQueue(); //�����°�(���Լ����),å�� ������ ��ȯ
	int getSize(); // ��ü ��� ��Ҹ� ������ �ִ���
}
