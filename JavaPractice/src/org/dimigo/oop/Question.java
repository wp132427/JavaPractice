package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 가수는 ?");
		
		answer = scanner.nextLine();
		
		if("빅뱅".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 배우는 ?");
		
		answer = scanner.nextLine();
		
		if("조인성".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 과목은 ?");
		
		answer = scanner.nextLine();
		
		if("자바".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		while(true)
		{
			System.out.println("끝내겠습니까??");
			
			answer = scanner.nextLine();
			
			if("네".equals(answer)){
				System.out.println("정답입니다.");
				System.exit(0);
			}
			else
				System.out.println("틀렸습니다.");
		}
	}

}
