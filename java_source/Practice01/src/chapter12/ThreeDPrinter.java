package chapter12;

public class ThreeDPrinter<T extends Material> { //Material�� ��ӹ��� �ڷ����� �� �� �ְ� ������ ��
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
	}

	@Override
	public String toString() {
		return	material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	//T�� Object�� ��ȯ�� �ǰ� �����Ϸ��� ���߿� ĳ���� ���ش�
}
