package org.dimigo.oop;

public class SnackTest {

	static int cal = 0;
	public static void main(String[] args) {
		Snack[] snacks = new Snack[]{new Snack("�����", "���" , 1100, 2),new Snack("�ܯ�", "ũ���" , 1200, 1), new Snack("��Ϲ���Ĩ", "����" , 1500, 4)};
		
		for(Snack i : snacks){
			i.PrinkSnack();
			cal += i.calcPrice();
		}
		System.out.println("�� ���� �ݾ�: " + String.format("%,d", cal) +"��");
	}
}