package day07.dimarray.exercise;

// ��ɿ� Ŭ����
public class Exercise_DimArray {
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21

		
//		arrs[0][4] = 1;
//		arrs[0][3] = 2;
//		arrs[0][2] = 3;
//		arrs[0][1] = 4;
//		arrs[0][0] = 5;
//		
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
//		
//		arrs[2][4] = 11;
//		arrs[2][3] = 12;
//		arrs[2][2] = 13;
//		arrs[2][1] = 14;
//		arrs[2][0] = 15;
		
		int arrs [][] = new int[5][5];
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21	
		
		int arrs [][] = new int[5][5];
		int k = 1;

		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
		arrs[4][0] = 1;
		arrs[3][0] = 2;
		arrs[2][0] = 3;
		arrs[1][0] = 4;
		arrs[0][0] = 5;

		arrs[4][1] = 6;
		arrs[3][1] = 7;
		arrs[2][1] = 8;
		arrs[1][1] = 9;
		arrs[0][1] = 10;
		
		arrs[4][2] = 11;
		arrs[3][2] = 12;
		arrs[2][2] = 13;
		arrs[1][2] = 14;
		arrs[0][2] = 15;
		
		arrs[4][3] = 16;
		arrs[3][3] = 17;
		arrs[2][3] = 18;
		arrs[1][3] = 19;
		arrs[0][3] = 20;

		arrs[4][4] = 21;
		arrs[3][4] = 22;
		arrs[2][4] = 23;
		arrs[1][4] = 24;
		arrs[0][4] = 25;
		
//		int arrs [][] = new int[5][5];
//		//int k = 1;
//
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0, k = 1; j < 5; j++, k++) {
//				arrs[i][j] = 5*k-i;
//				//k++;
//			}
//		}
//		for(int i = 0; i < arrs.length; i++) {
//			for(int j = 0; j < arrs[i].length; j++) {
//				System.out.printf("%2d\t", arrs[i][j]);
//			}
//			System.out.println();
//		}
		arrs[0][0] = 5*1;
		arrs[0][1] = 5*2;
		arrs[0][2] = 5*3;
		arrs[0][3] = 5*4;
		arrs[0][4] = 5*5;
		
		arrs[1][0] = 5*1-1;
		arrs[1][1] = 5*2-1;
		arrs[1][2] = 5*3-1;
		arrs[1][3] = 5*4-1;
		arrs[1][4] = 5*5-1;
		
		arrs[2][0] = 5*1-2;
		arrs[2][1] = 5*2-2;
		arrs[2][2] = 5*3-2;
		arrs[2][3] = 5*4-2;
		arrs[2][4] = 5*5-2;
		
		arrs[3][0] = 5*1-3;
		arrs[3][1] = 5*2-3;
		arrs[3][2] = 5*3-3;
		arrs[3][3] = 5*4-3;
		arrs[3][4] = 5*5-3;
		
		arrs[4][0] = 5*1-4;
		arrs[4][1] = 5*2-4;
		arrs[4][2] = 5*3-4;
		arrs[4][3] = 5*4-4;
		arrs[4][4] = 5*5-4;
		
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
	}
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
	}
}
