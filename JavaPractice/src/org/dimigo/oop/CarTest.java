package org.dimigo.oop;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car.setCompany("�����ڵ���");
		car.setModel("���׽ý�");
		car.setColor("������");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		
		System.out.println("������� : " + car.getCompany());
		System.out.println("�𵨸� : " + car.getModel());
		System.out.println("���� : " + car.getColor());
		System.out.println("�ִ�ӵ� : " + car.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car.getPrice())+"��");
		System.out.println();
		
		car2.setCompany("����ڵ���");
		car2.setModel("k7");
		car2.setColor("���");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car2.getPrice())+ "��");
		System.out.println();
		
		car3.setCompany("�Ｚ�ڵ���");
		car3.setModel("SM7");
		car3.setColor("ȸ��");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car3.getPrice()) + "��");
		System.out.println();
	}

}
