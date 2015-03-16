package org.dimigo.basic;

public class HelloWorld {

	public static void main(String[] args) {
		
		String Name = "아이유";
	    boolean Male = false;
	    int Age = 23;
	    double Height = 161.8;
	    float Weight = 44.3f;
	    char BloodType = 'A';
	      
	    System.out.println("<<아이유 프로필>>");
	    System.out.println("이름 : "+Name);
	    System.out.print("성별 : ");
	    if(Male)
	         System.out.println("남자");
	    else
	         System.out.println("여자");
	      
	    System.out.println("나이 : "+Age+"세");
	    System.out.println("키 : "+Height+"cm");
	    System.out.println("몸무게 : "+Weight+"kg");
	    System.out.println("혈액형 : "+BloodType+"형");

	}

}
