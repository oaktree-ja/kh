package day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	/*
	 * ����1
	 * ������ �г��� ������ �Է¹޾� 60�� �̻��̸� �հ�
	 * 60�� �̸��̸� ���հ����� ����Ѵ�.
	 * ��, 4�г��� ��� 70�� �̻��̾�� �հ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ������ �Է��ϼ���(0~100) : 89
	 * �г��� �Է��ϼ���(1~4) : 4
	 * �հ��Դϴ�.
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = sc.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4) : ");
		int grade = sc.nextInt();
		// 4�г�
		// #1.
		if(grade != 4) {
			if(score >= 60) {
				System.out.println("�հ��Դϴ�.");
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		}else {
			if(score >= 70) {
				System.out.println("�հ��Դϴ�.");
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		}
		// #2.
		if(grade == 4 && score >= 70) {
			System.out.println("�հ��Դϴ�.");
		}else if(grade != 4 && score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		// #3.
		// �հ�/���հ�
		if(score >= 60) {
			if(grade == 4 && score < 70) {
				System.out.println("���հ��Դϴ�.");
				return;
			}
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
