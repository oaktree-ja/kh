package day05.array.practice;
import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * ���̰� 10�� �迭 ����
		 * 1���� 10���� �� 
		 * �ݺ����� �̿��Ͽ� ������� �迭�� ����
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arrs[i]+ " "); 
		}
	}
	public void practice2() {
		/*
		 * ���̰� 10�� �迭 ����
		 * 10���� 1���� �� 
		 * �ݺ����� �̿��Ͽ� ������� �迭�� ����
		 */
		int [] arrs = new int[10];
		for(int i = 0, count=10; i < 10; i++,count--)
			arrs[i] = count;
		for(int i = 0; i < 10; i++)
			System.out.print(arrs[i]+ " ");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		// �迭�� ������ ���� (1 ~ input����)
		for(int i = 0; i < input; i++) {
			nums[i] = (i+1);
			System.out.print(nums[i] + " ");
		}
	}
	public void practice4() {
		/*
		 * ���̰� 5�� String �迭 ����
		 * "���", "��", "����", "������", "����" ������� ����
		 * �׸��� �迭 �ε����� �̿��ؼ� �� ���
		 */
		String fruits [];
		fruits = new String[5];
		fruits[0] = "���";
		fruits[1] = "��";
		fruits[2] = "����";
		fruits[3] = "������";
		fruits[4] = "����";
		System.out.println(fruits[1]); // ��
		for(int i = 0; i < fruits.length; i++)
			System.out.print(fruits[i] + " ");
	}
	public void practice5() {
		System.out.println("practice5");
	}
	public void practice6() {
		System.out.println("practice6");
	}
	public void practice7() {
		// ����ڰ� �迭�� ���̸� ���� �Է�
		// �� ����ŭ ������ �迭�� ����, ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		int sum = 0;
		// �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է�, ������ �ε����� ���� �ʱ�ȭ
		for(int i = 0; i < nums.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			input = sc.nextInt();
			nums[i] = input;
			// ������
			sum += nums[i];
		}
		// ��ü���� �����ϰ�.. + �� �ε����� ����� ������ �� ���
		for(int num: nums) 
			System.out.print(num + " ");
		
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() {
		System.out.println("practice10");
	}
	public void practice11() {
		/*
		 * �ζ� ��ȣ �ڵ� ���� ���α׷��� �ۼ��Ͻÿ�
		 * ��, �ߺ��� ���� ������������ �����Ͽ� ����ϼ���.
		 */
		int [] lottos = new int[6];
		Random rand = new Random();
		for(int i = 0; i < lottos.length; i++) {
			// 1 ~ 45 ������ ���ڰ� �����ϰ� ���;� ��.
			//System.out.print((rand.nextInt(45)+1)+ " ");
			// �迭�ȿ� �־��
			lottos[i] = rand.nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;
				}
			}
			
//			// #1
//			if(lottos[1] == lottos[0]) {
//				i--;
//			}
//			// #2
//			if(lottos[2] == lottos[1]) {
//				i--;
//			}
//			if(lottos[2] == lottos[0]) {
//				i--;
//			}
//			
//			// #3
//			if(lottos[3] == lottos[2]) {
//				i--;
//			}
//			if(lottos[3] == lottos[1]) {
//				i--;
//			}
//			if(lottos[3] == lottos[0]) {
//				i--;
//			}
//			
//			// #4
//			if(lottos[4] == lottos[3]) {
//				i--;
//			}
//			if(lottos[4] == lottos[2]) {
//				i--;
//			}
//			if(lottos[4] == lottos[1]) {
//				i--;
//			}
//			if(lottos[4] == lottos[0]) {
//				i--;
//			}
//			
//			// #5
//			if(lottos[5] == lottos[4]) {
//				i--;
//			}
//			if(lottos[5] == lottos[3]) {
//				i--;
//			}
//			if(lottos[5] == lottos[2]) {
//				i--;
//			}
//			if(lottos[5] == lottos[1]) {
//				i--;
//			}
//			if(lottos[5] == lottos[0]) {
//				i--;
//			}
		}
		System.out.println();
		// ����, ����, ����, ��, ����, ...
		for(int j = 0; j < (lottos.length-1); j++) {
			for(int i = 0; i < (lottos.length-1)-j; i++) {
				if(lottos[i] > lottos[i+1]) {
					int temp = lottos[i];
					lottos[i] = lottos[i+1];
					lottos[i+1] = temp;
				}
			}
		}
		for(int lotto: lottos) {
			System.out.print(lotto + " ");
		}
		System.out.println();
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		boolean flag = true;
		switch(name) {
			case "ȫ�浿": break;
			default: flag = false;
		}
//		if(!name.equals("ȫ�浿")){
//			flag = false;
//		}
		String result = "������";
		
//		switch(flag) {
//			case true: result += "�½��ϴ�"; break;
//			case false: result += "�ƴմϴ�"; break;
//		}
		
		if(flag){
			result += "�½��ϴ�";
		} else {
			result += "�ƴմϴ�";
		}
		System.out.print(result);

	}