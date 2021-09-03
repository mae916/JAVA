package test20210825;

public class Exam3 {
	public static void main(String[] args) {

		int floor = 5;
		String inform;
				
		switch(floor){
		
			case 1:	inform = "1Ãþ ¾à±¹";
				break;
				
			case 2: inform = "2Ãþ Á¤Çü¿Ü°ú";
				break;
			
			case 3: inform = "3Ãþ ÇÇºÎ°ú";
				break;
				
			case 4: inform = "4Ãþ Ä¡°ú";
				break;
			
			case 5: inform = "5Ãþ Çï½ºÅ¬·´";
				break;
			
			default: inform = "¾ø´Â Ãþ";
				
		}		
		System.out.println(inform + "ÀÔ´Ï´Ù.");
	}
}
