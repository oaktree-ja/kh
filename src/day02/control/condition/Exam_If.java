package day02.control.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		/*
		 * ��� - ���ǹ�
		 * ����
		 * if ( ���ǽ� ) { ���๮��; }
		 * else { ���๮��2; }
		 */
		// ����1. �Է¹��� ������ 0���� ū�� �Ǻ��ϴ�
		// ���α׷��� �ۼ��Ͽ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("ũ��.");
		}else {
			System.out.println("ũ�� �ʴ�.");
		}
		// ����2. ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("���� �ϳ� �Է� : ");
		input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
		// ����3. �Է¹��� ������ ������������, ���� �������� �ƴϸ� 0����
		// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("���� �ϳ� �Է� : ");
		input = sc.nextInt();
		// ���׿����ڷ� �ۼ��غ���
//		String result = (input > 0) ? "���� ����" : ((input < 0) ? "���� ����" : "0");
		String result = (input == 0) ? "0" : ((input < 0) ? "���� ����" : "���� ����"); // ��ø ���׿���, ��ø if�� ����
		System.out.println(result+"�Դϴ�.");
		
		if(input > 0) {
			System.out.println("���� �����Դϴ�.");
		}else if(input == 0){
			System.out.println("0�Դϴ�.");
		}else {
			System.out.println("���� �����Դϴ�.");
		}
		
		if(input > 0) {
			System.out.println("���� �����Դϴ�.");
		}else {
			if(input == 0) {
				System.out.println("0�Դϴ�.");
			}else {
				if(input < 0) {
					System.out.println("���� �����Դϴ�.");
				}
			}
		}
		
		if(input == 0) {
			System.out.println("0�Դϴ�.");
		}else {
			if(input > 0) {
				System.out.println("���������Դϴ�.");
			}else {
				System.out.println("���������Դϴ�.");
			}
		}
	}
}







