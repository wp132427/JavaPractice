package org.dimigo.oop;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car2 car = new Car2("�����ڵ���","���׽ý�","������",225,50000000);
	    Car2 car2 = new Car2("����ڵ���","K7","���",246,40000000);
	    Car2 car3 = new Car2("�Ｚ�ڵ���","SM7","ȸ��",200,38000000);
		
		System.out.println("������� : " + car.getCompany());
		System.out.println("�𵨸� : " + car.getModel());
		System.out.println("���� : " + car.getColor());
		System.out.println("�ִ�ӵ� : " + car.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car.getPrice())+"��");
		System.out.println();

		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car2.getPrice())+ "��");
		System.out.println();
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car3.getPrice()) + "��");
		System.out.println();
	}

}
