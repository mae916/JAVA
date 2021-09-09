package chapter12;

public class ThreeDPrinter<T extends Material> { //Material을 상속받은 자료형만 쓸 수 있게 제한을 둠
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
	
	//T는 Object로 변환이 되고 컴파일러가 나중에 캐스팅 해준다
}
