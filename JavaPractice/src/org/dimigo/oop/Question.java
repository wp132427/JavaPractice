package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 가수는 ?");
		
		answer = scanner.nextLine();
		
		if("스위트걸".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 배우는 ?");
		
		answer = scanner.nextLine();
		
		if("박수진".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 책은 ?");
		
		answer = scanner.nextLine();
		  
		if("자바를잡아라".equals(answer))
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다.");
		
		while(true)
		{
			System.out.println("끝내겠습니까??");
			
			answer = scanner.nextLine();
			
			if("네".equals(answer)){
				System.out.println("정답입니다.");
				scanner.close();
				System.exit(0);
			} 
			else
				System.out.println("틀렸습니다.");
		}
	}
}