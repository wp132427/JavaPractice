
package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �Է� => ");
		int kor = scanner.nextInt();
		
		System.out.println("���� ���� �Է� => ");
		int mat = scanner.nextInt();
		
		System.out.println("���� ���� �Է� => ");
		int eng = scanner.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("���� ���� : ")
		.append(kor + " ��\n")
		
		.append("���� ���� : ")
		.append(mat + " ��\n")
		
		.append("���� ���� : ")
		.append(eng + " ��\n")
		
		.append("���� : ")
		.append(sum + " ��\n")
		
		.append("��� : ")
		.append(String.format("%.1f", avg) + " ��\n");
		
		System.out.println("<< ���� ��� >>");
		System.out.println(sb);
		
		scanner.close();

	}

}
