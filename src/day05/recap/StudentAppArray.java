package day05.recap;

import java.util.Scanner;

public class StudentAppArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] scores = new int[3];
//		int kor, eng, math;
//		kor = 0;
//		eng = 0;
//		math = 0;
		finish:
		while(true) {
			System.out.println("====== ���� �޴� ======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� >> ");
			//int choice;
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("====== ���� �Է� ======");
				System.out.print("���� : ");
				scores[0] = sc.nextInt();
				System.out.print("���� : ");
				scores[1] = sc.nextInt();
				System.out.print("���� : ");
				scores[2] = sc.nextInt();
				break;
			case 2: 
				System.out.println("====== ���� ��� ======");
				System.out.println("���� : " + scores[0]);
				System.out.println("���� : " + scores[1]);
				System.out.println("���� : " + scores[2]);
				System.out.println("���� : " + (scores[0]+scores[1]+scores[2]));
				System.out.println("��� : " + (scores[0]+scores[1]+scores[2])/(double)scores.length);
				break;
			case 3: 
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break finish;
			default : 
				System.out.println("1 ~ 3 ������ ���� �Է����ּ���.");
				break;
			}
			
		}
		
		
	}
}
