package day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
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
		System.out.println("�ֹ��Ͻðھ��? ������ �˷��帳�ϴ�.");
		System.out.println("(����������, īǪġ��, ī���, �Ƹ޸�ī��)");
		System.out.print("�޴��� �Է����ּ��� : ");
		String menu = sc.next();
		// �� ���
		int price = 0;
		switch(menu) {
			case "����������" : 
				price = 2500;
				//System.out.println("2500���Դϴ�."); 
				break;
			case "īǪġ��" : 
				price = 4500;
				//System.out.println("4500���Դϴ�."); 
				break;
			case "ī���" : 
				price = 4000;
				//System.out.println("4000���Դϴ�."); 
				break;
			case "�Ƹ޸�ī��" :
				price = 3500;
				//System.out.println("3500���Դϴ�."); 
				break;
			default: 
				System.out.println("���� �޴��Դϴ�.");
				// ���� ���ϰ� �ϴ� ��� #1
				return;
		}
		// ���� ���ϰ� �ϴ� ��� #2
		//if(price != 0) {
			System.out.println(price+"���Դϴ�.");
		//}
	}
}












