package day05.array;

public class Exam_Array {
	public static void main(String[] args) {
		/*
		 * �迭�� ����
		 * �迭�� ����
		 * �迭�� �ʱ�ȭ
		 * �迭�� ������ ����
		 * �迭�� ������ ���
		 */
		int [] nums;
		nums = new int[10];
		nums[0] = 11;
		nums[1] = 18;
		
		// System.out.println(nums[10]); // ArrayIndexOutOfBoundsException

		// for������ ������ ����
		for(int i = 0; i < 10; i++)
			nums[i] = (i+1);
		
		// for������ ������ ���
		for(int i = 0; i < 10; i++)
			System.out.println(nums[i]);
		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
//		System.out.println(nums[5]);
//		System.out.println(nums[6]);
//		System.out.println(nums[7]);
//		System.out.println(nums[8]);
//		System.out.println(nums[9]);
	}
}
