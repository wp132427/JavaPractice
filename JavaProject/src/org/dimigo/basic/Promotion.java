package org.dimigo.basic;

/**
 * 
 * ��̺��� ���� �ΰǺ� ����ϱ�
 * 
 * 2427 �̰���
 *
 */
public class Promotion {

	public static void main(String[] args) {
		
		int money = 1700000;
		int workersu = 3;
		int shopsu = 1500;
		long yearmoney = (long) money * 12 * workersu * shopsu;
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", 1700000) + "��");
		System.out.println("���� �� ���� �� : 3��");
		System.out.println("���� �� : " + String.format("%,d", 1500) + "��");
		
		System.out.println("���� �ΰǺ� : " + String.format("%,d", yearmoney) + "��");
		

	}

}
