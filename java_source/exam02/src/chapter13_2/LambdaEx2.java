package chapter13_2;

public class LambdaEx2 {
	public static void main(String[] args) {
		PrintString p = s -> s;
		showPrint(p);
		
		PrintString p2 = getPrintString();
		System.out.println(p2.print("Å×½ºÆ®2"));
	}
	
	public static void showPrint(PrintString p) {
		System.out.println(p.print("Å×½ºÆ®1"));
	}
	
	public static PrintString getPrintString() {
		//PrintString p = s -> s;
		//return p;
		return s -> s;
	}
}