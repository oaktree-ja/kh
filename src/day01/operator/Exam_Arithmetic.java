package day01.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		// �� ������ ������ �Է¹ް�, ��ð�, ���, ��������
		// ����ϴ� ���α׷��� �ۼ��Ͽ���
		// �ʴ����� ���� �Է� : 3000
		// 0�ð� 50�� 0���Դϴ�.
		// �ʴ����� ���� �Է� : 3287
		// 0�ð� 54�� 47���Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ ���� �Է� : ");
		int time = sc.nextInt();
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;
		int second = time % 60;
		System.out.println(hour+"�ð� "+minute+"�� " + second + "���Դϴ�.");
		
		
//		System.out.println(11+18);
//		System.out.println(11-18);
//		System.out.println(11*18);
//		System.out.println(11/18); // ������� ���� ����
//		System.out.println(11%18); // ������� �������� ����
//		System.out.println(9/2);
//		System.out.println(9%2);
	}
}
