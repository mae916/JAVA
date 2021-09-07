package chapter13_3;

import java.util.Arrays;
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

}
