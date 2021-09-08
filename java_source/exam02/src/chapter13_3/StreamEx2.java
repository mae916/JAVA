package chapter13_3;

import java.util.Arrays;

public class StreamEx2 {
	public static void main(String[] args) {
		String[] fruits = { "apple", "melon", "orange", "water melon"};
		Arrays.stream(fruits).filter(s -> s.length() <= 5).forEach(s -> System.out.println(s));
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
