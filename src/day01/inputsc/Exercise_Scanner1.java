package day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner1 {
	public static void main(String [] args) {
		/*
		 * �̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է¹�������
		 * Kim Seoul 20 65.1 true
		 * �̸��� Kim, ���ô� Seoul, ���̴� 20��, ü���� 65.1kg, ���� ���δ� true�Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean soloYn = sc.nextBoolean();
//		System.out.println("�̸��� " + name + ", ���ô� " + city 
//				+ ", ���̴� " + age + "��, ü���� " + weight + "kg, ���� ���δ� " + soloYn + "�Դϴ�.");
		System.out.printf("�̸��� %s, ���ô� %s, ���̴� %d��, ü���� %.2fkg, ���� ���δ� %b�Դϴ�.\n"
				, name, city, age, weight, soloYn);
	}
}
