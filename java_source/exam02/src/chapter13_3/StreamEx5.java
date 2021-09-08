package chapter13_3;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.function.IntBinaryOperator;

class NumsReducer implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left + right;
	}
}


public class StreamEx5 {	
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int result = Arrays.stream(nums).reduce(0, (a, v) -> a + v);
		System.out.println(result);
		
		int result2 = Arrays.stream(nums).reduce(0, new NumsReducer());
		System.out.println(result2);
		
		//Arrays.stream(nums).reduce((a, v) -> a + v).stream().forEach(n -> System.out.println(n));
		int result3 = Arrays.stream(nums).reduce((a, v) -> a + v).getAsInt();
		System.out.println(result3);
	}
=======
import java.util.function.IntBinayOperator;

class NumsReducer implements IntBinayOperator {

	
	
}

public class StreamEx5 {

		public static void main(String[]args) {
			int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
			
			int result = Arrays.stream(nums).reduce(0,(a,v) -> a+v);
			System.out.println(result);
			
			int result2 = Arrays.stream(nums).reduce(0, New NumsReducer);
	}

>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
}
