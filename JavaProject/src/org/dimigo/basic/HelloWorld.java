package org.dimigo.basic;

public class HelloWorld {

	public static void main(String[] args) {
		
		String Name = "������";
	    boolean Male = false;
	    int Age = 23;
	    double Height = 161.8;
	    float Weight = 44.3f;
	    char BloodType = 'A';
	      
	    System.out.println("<<������ ������>>");
	    System.out.println("�̸� : "+Name);
	    System.out.print("���� : ");
	    if(Male)
	         System.out.println("����");
	    else
	         System.out.println("����");
	      
	    System.out.println("���� : "+Age+"��");
	    System.out.println("Ű : "+Height+"cm");
	    System.out.println("������ : "+Weight+"kg");
	    System.out.println("������ : "+BloodType+"��");

	}

}
