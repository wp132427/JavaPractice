package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
			
			int distance = 100;
			String car = "��ӹ���";
			
			if(car == "����"){
				if(distance <= 10) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ����");
					System.out.println("����� : 300��");
				} else if(distance <= 20) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ����");
					System.out.println("����� : 500��");
				} else if(distance <= 30) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ����");
					System.out.println("����� : 700��");
				} else {
					System.out.println("�Ÿ� : " + distance +"km");
					System.out.println("����  : ����");
					System.out.println("����� : "+ (300+((int)distance/10)*200) + "��");
				}
			}
			else if(car == "��ӹ���") {
				if(distance <= 10) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ��ӹ���");
					System.out.println("����� : 850��");
				} else if(distance <= 20) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ��ӹ���");
					System.out.println("����� : 1150��");
				} else if(distance <= 30) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : ��ӹ���");
					System.out.println("����� : 1450��");
				} else {
					System.out.println("�Ÿ� : " + distance +"km");
					System.out.println("����  : ��ӹ���");
					System.out.println("����� : " + (850+((int)distance/10)*300) + "��");
				}
			}
			else {
				if(distance <= 10) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : �� ��");
					System.out.println("����� : 600��");
				} else if(distance <= 20) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : �� ��");
					System.out.println("����� : 800��");
				} else if(distance <= 30) {
					System.out.println("�Ÿ� : " + distance + "km");
					System.out.println("����  : �� ��");
					System.out.println("����� : 1000��");
				} else {
					System.out.println("�Ÿ� : " + distance +"km");
					System.out.println("����  : �� ��");
					System.out.println("����� : " + (600+((int)distance/10)*200) + "��");
				}
			}

	}

}
