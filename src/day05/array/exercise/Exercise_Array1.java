package com.trump.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	/*
	 * �迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������
	 * �Է¹ް� ����� ���ϴ� ���α׷��� �ۼ��϶�.
	 * ��, �迭�� ũ��� 5�̴�.	
	 */
	public static void main(String [] args) {
		int [] nums = new int[5];
		System.out.println(nums.length);
		Scanner sc = new Scanner(System.in);
		// nums �迭�� 24 11 18 5 2 ������� ���� ��
		// ����� ���ϴ� ���α׷��� �ۼ��Ͽ���.
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i]= sc.nextInt();
			total += nums[i];
		}
		
//		nums[0] = sc.nextInt();
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
//		int total = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		double avg = total/(double)5;
		System.out.println("��� : " + avg);
	}
}
