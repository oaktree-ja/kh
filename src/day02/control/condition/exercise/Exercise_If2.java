package day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	/*
	 * ����2
	 * Ŀ�Ǹ޴��� �Է¹ް� ������ �˷��ִ� ���α׷��� �ۼ��Ͻÿ�
	 * �ֹ��Ͻðھ��? ������ �˷��帳�ϴ�.
	 * (����������, īǪġ��, ī���, �Ƹ޸�ī��)
	 * �޴��� �Է����ּ��� : ����������
	 * 2500���Դϴ�.
	 * �޴��� �Է����ּ��� : �ڹ�Ĩ������ġ��
	 * ���� �޴��Դϴ�.
	 */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �Է����ּ��� : ");
		String menu = sc.next();
//		String menu = "����������";
		if(menu.equals("����������")) {
			System.out.println("2500���Դϴ�.");
		}else if(menu.equals("īǪġ��")) {
			System.out.println("4500���Դϴ�.");
		}else if(menu.equals("ī���")) {
			System.out.println("4000���Դϴ�.");
		}else if(menu.equals("�Ƹ޸�ī��")) {
			System.out.println("3500���Դϴ�.");
		}else {
			System.out.println("���� �޴��Դϴ�.");
		}
//		String msg1 = "hello";
//		String msg2 = "hello";
//		String msg3 = new String("hello");
//		if(msg1 == msg3) {
//			System.out.println("����.");
//		}else {
//			System.out.println("�ٸ���.");
//		}
		
	}
}
