package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("���� �����ϴ� ������ ?");
		answer = scanner.nextLine();
		if("���".equals(answer))
			System.out.println("�����Դϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
		
		System.out.println("���� �����ϴ� ���� ?");
		answer = scanner.nextLine();
		
		if("���μ�".equals(answer))
			System.out.println("�����Դϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
		
		System.out.println("���� �����ϴ� ������ ?");
		
		answer = scanner.nextLine();
		
		if("�ڹ�".equals(answer))
			System.out.println("�����Դϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
		
		while(true)
		{
			System.out.println("�����ڽ��ϱ�??");
			
			answer = scanner.nextLine();
			
			if("��".equals(answer)){
				System.out.println("�����Դϴ�.");
				System.exit(0);
			}
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}

}
