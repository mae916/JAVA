package chapter12;

public class ThreeDPrinterTest {
	public static void main(String[]args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder());
		
		Powder powder = (Powder) printer.getMaterial();
	}
}
