package day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		/*
		 * ���������̶�?
		 * �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����
		 * �������� ���� ���� �� ���� ������ �����ִ� ����,
		 * �������� ���� ���� �� �ް��� ���� ���ϸ� ����.
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		//int min = 0;
		for(int i = 0; i < arrs.length; i++) {
			int min = i;
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		
//		// #1
//		for(int j = 1; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {
//				min = j;
//			}
//		}
//		int temp = arrs[0];
//		arrs[0] = arrs[min];
//		arrs[min] = temp;
//		// #2
//		for(int j = 2; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {
//				min = j;
//			}
//		}
//		temp = arrs[1];
//		arrs[1] = arrs[min];
//		arrs[min] = temp;
//		// #3
//		for(int j = 3; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {
//				min = j;
//			}
//		}
//		temp = arrs[2];
//		arrs[2] = arrs[min];
//		arrs[min] = temp;
//		// #4
//		for(int j = 4; j < arrs.length; j++) {
//			if(arrs[min] > arrs[j]) {
//				min = j;
//			}
//		}
//		temp = arrs[3];
//		arrs[3] = arrs[min];
//		arrs[min] = temp;
		// ��� �ڵ�
		for(int num: arrs) {
			System.out.print(num + " ");
		}
//		if(arrs[0] > arrs[1]) {
//			// �ε������� ����ϴ� �ڵ�
//			min = 1;
//		}
//		if(arrs[0] > arrs[2]) {
//			min = 2;
//		}
//		if(arrs[0] > arrs[3]) {
//			min = 3;
//		}
//		if(arrs[0] > arrs[4]) {
//			min = 4;
//		}
	}
}
