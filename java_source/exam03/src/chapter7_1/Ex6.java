package chapter7_1;

public class Ex6 {
	public static void main(String[]args) {
		// �迭���� �����͸� ���� �ϴ� ���, ������ -> ArrayList ���
		int[] nums = {0,1,2,3,4,5,6,7}; // 3����
		int[] nums2 = new int[nums.length-1];
		
		for(int i = 0; i < 3; i++) { //3�� ������ 0~2,
			nums2[i] = nums[i];
		}
		
		for(int i = 4, j = 3; i < nums.length; i++, j++) {// 4~7 �����ؼ� �־���
			nums2[j] = nums[i];
		}
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(i + "=" + nums2[i]);
		}
	}
}