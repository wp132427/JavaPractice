package org.dimigo.basic;

/**
 * 
 * 디미베네 연간 인건비 계산하기
 * 
 * 2427 이경훈
 *
 */
public class Promotion {

	public static void main(String[] args) {
		
		int money = 1700000;
		int workersu = 3;
		int shopsu = 1500;
		long yearmoney = (long) money * 12 * workersu * shopsu;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", 1700000) + "원");
		System.out.println("점포 내 직원 수 : 3명");
		System.out.println("점포 수 : " + String.format("%,d", 1500) + "개");
		
		System.out.println("연간 인건비 : " + String.format("%,d", yearmoney) + "원");
		

	}

}
