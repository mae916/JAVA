package chapter12_1;

public class Ex1 {
	publicstatic void main(String[]args) {
		ThreeDPrinter printer = newThreeDPrinter();
		printer.addMaterial(new Plastic());
		System.out.println(printer);
		
		printer.addMaterial(new Powder());
		System.out.println(printer);
	}
}
