package day06.array.sort;

public class Exam_BubbleSort {
	public static void main(String [] args) {
		/*
		 *  ���������̶�?
		 *  ������ �� ���� ���Ҹ� �˻��Ͽ� �����ϴ� ���.
		 *  ������ ���ٴ� ����, �̹� ���ĵ� �����͸� ������ �� ���� ����.
		 *  �⺻������ �ٸ� ���Ŀ� ���ؼ� �ӵ��� �������̸� �������� �� �����͸� ������ �� ���� ����.
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		
		// 0�� �ڸ����� i
		// 1�� �ڸ����� i+1
		// i�� 0���� 3���� ����
		for(int j = 0; j < arrs.length-1; j++) {
			for(int i = 0; i < (arrs.length-1)-j; i++) {
				if(arrs[i] > arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1] = arrs[i];
					arrs[i] = temp;
				}
			}
		}
//		for(int j = 4; j > 0; j--) {
//			for(int i = 0; i < j; i++) {
//				if(arrs[i] > arrs[i+1]) {
//					int temp = arrs[i+1];
//					arrs[i+1] = arrs[i];
//					arrs[i] = temp;
//				}
//			}
//		}
		
//		for(int i = 0; i < 4; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i = 0; i < 2; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i = 0; i < 1; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
		
		for(int num: arrs) 
			System.out.print(num + " ");
		
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
	}
}
