package com.trump.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) throws IOException {
		System.out.print("������ �Է� : ");
		//int input = System.in.read();
		//System.out.println("��� : " + (input-48));
		Scanner sc = new Scanner(System.in);	// ������ �ۼ�
		//int input = sc.nextInt();				// ���� �Է� nextInt
		double radius = sc.nextDouble();		// �Ǽ� �Է� nextDouble
		String msg = sc.next();					// ���ڿ� �Է� next
		//System.out.println("�Է� ���� �� : " + input);
		final double PI = 3.14;
		
		double circleArea = radius * radius * PI;
		System.out.println("���� ���� : " + circleArea);
	}
}
