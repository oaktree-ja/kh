package com.trump.day05.array;

public class Exam_ExchangeValue {
	public static void main(String [] args) {
		System.out.println("�迭�� ��ȯ�ϱ�");
		int [] spaces = {24, 25};
		// ����ڵ� �ۼ�
		for(int val: spaces) 
			System.out.println(val);
		System.out.println("exchanged!");
		// ��ȯ �ڵ� �ۼ�
		int temp = spaces[0];
		spaces[0] = spaces[1];
		spaces[1] = temp;
		// ����ڵ� �ۼ�
		for(int val: spaces) 
			System.out.println(val);
		
		System.out.println("������ ��ȯ�ϱ�");
		int space1 = 24;
		int space2 = 25;
		System.out.println(space1);
		System.out.println(space2);
		System.out.println("exchanged!");
		temp = space1;
		space1 = space2;
		space2 = temp;
		System.out.println(space1);
		System.out.println(space2);
	}
}
