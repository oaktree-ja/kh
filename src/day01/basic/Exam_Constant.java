package day01.basic;

public class Exam_Constant {
	public static void main(String [] args) {
		// ���� ������ ���ϴ� ���α׷��� �ۼ��غ���.
		// ���� ���� = ������ * ������ * PI
		final double PI = 3.14;
		
		//PI = 3.24; // ���Ҵ� �Ұ��� -> ���(final)
		double radius = 10.2;
		radius = 5.2;
		double circleArea = radius * radius * PI;
		System.out.println("���� ���� : " + circleArea);
		// �������� �Է����ּ��� : 10.2
		// ���� ���� : 326.68559999999997
		
		// �������� �Է����ּ��� : 5.2
		// ���� ���� : 84.9056
	}
}
