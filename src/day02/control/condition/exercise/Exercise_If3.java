package day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	/*
	 * ����3
	 * ������ �Է¹޾� ����� �˷��ִ� ���α׷��� �ۼ��ϼ���.
	 * ��, ������ 0 ~ 100 ������ ���� �Է��ϵ��� ��.
	 * ������ �Է����ּ��� : 92
	 * ������ A�Դϴ�.
	 * 
	 * ������ �Է����ּ��� : 102
	 * 0 ~ 100 ������ ���� �Է����ּ���
	 * ĿƮ���� ( 90 ~ 100 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, �� �� F )
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int score = sc.nextInt();
		// #2
		// �� ���
		char grade = 0;
		if(score < 0 || score > 100) {
			System.out.println("0 ~ 100 ������ ���� �Է����ּ���.");
			// ���� ���ϰ� �ϴ� ��� #1
			// return;
		}else {
			if(score >= 90) {
				grade = 'A';
				//System.out.println("������ A�Դϴ�.");
			}else if(score >= 80) {
				grade = 'B';
				//System.out.println("������ B�Դϴ�.");
			}else if(score >= 70) {
				grade = 'C';
				//System.out.println("������ C�Դϴ�.");
			}else if(score >= 60) {
				grade = 'D';
				//System.out.println("������ D�Դϴ�.");
			}else {
				grade = 'F';
//				System.out.println("������ F�Դϴ�.");
			}
		}
		// ���� ���ϰ� �ϴ� ��� #2
		if(grade != 0) {
			System.out.println("������ "+grade+"�Դϴ�.");
		}
		
		// #1
		if(score < 0 || score > 100) {
			System.out.println("0 ~ 100 ������ ���� �Է����ּ���.");
			return;
		}
		if(score >= 90 && score <= 100) {
			System.out.println("������ A�Դϴ�.");
		}else if(score <= 89 && score >= 80) {
			System.out.println("������ B�Դϴ�.");
		}else if(score <= 79 && score >= 70) {
			System.out.println("������ C�Դϴ�.");
		}else if(score <= 69 && score >= 60) {
			System.out.println("������ D�Դϴ�.");
		}else {
			System.out.println("������ F�Դϴ�.");
		}
	}
}







