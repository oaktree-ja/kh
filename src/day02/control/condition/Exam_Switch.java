package day02.control.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
		/*
		 * ��� - ���ǹ�
		 * switch��
		 * ����
		 * switch(����) {
		 * 		case ���� ���� :
		 * 			���๮1;
		 * 			break;
		 * 		case ���� ����2 :
		 * 			���๮2;
		 * 			break;
		 * ex)
		 * switch(num) {
		 * 		case 1: ���๮1; break;
		 * 		case 2: ���๮2; break;
		 * 		case 3: ���๮3; break;
		 * 		default: ���๮0;
		 * }
		 * -> if ~ else if ~ else�� �����Ǵ� ����
		 */
		// ����. ������ �Է¹޾� �Է��� ���� 1�̸� ������, 2�̸� �����, 3�̸� �ʷϻ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		switch(num) {
			case 1: System.out.println("������"); break; 
			case 2: System.out.println("�����"); break; 
			case 3: System.out.println("�ʷϻ�"); break;
			default: System.out.println("1 ~ 3 ������ ���� �Է��ϼ���."); 
		}
		
		if(num == 1) {
			System.out.println("������");
		}else if(num == 2) {
			System.out.println("�����");
		}else if(num == 3) {
			System.out.println("�ʷϻ�");
		}else {
			System.out.println("1 ~ 3 ������ ���� �Է��ϼ���.");
		}
	}
}











