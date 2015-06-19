package org.dimigo.oop;

public class PiggyBank {
	
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + amount + "�� ����");
		System.out.println();
	}
	
	public static void printBalance() {
		System.out.println("���������� �� �ݾ� : " + balance + "��");
		System.out.println();
	}
}
