package chapter13_3;

import java.util.Arrays;

public class StreamEx4 {
<<<<<<< HEAD
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Arrays.stream(nums).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
=======
	public static void main(String[]args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		
		Arrays.stream(nums).filter(x->x%2==0).forEach(x->System.out.println(x));
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
	}
}
