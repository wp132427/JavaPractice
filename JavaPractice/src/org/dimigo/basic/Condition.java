package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
			
			int distance = 100;
			String car = "고속버스";
			
			if(car == "경차"){
				if(distance <= 10) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 경차");
					System.out.println("통행료 : 300원");
				} else if(distance <= 20) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 경차");
					System.out.println("통행료 : 500원");
				} else if(distance <= 30) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 경차");
					System.out.println("통행료 : 700원");
				} else {
					System.out.println("거리 : " + distance +"km");
					System.out.println("차종  : 경차");
					System.out.println("통행료 : "+ (300+((int)distance/10)*200) + "원");
				}
			}
			else if(car == "고속버스") {
				if(distance <= 10) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 고속버스");
					System.out.println("통행료 : 850원");
				} else if(distance <= 20) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 고속버스");
					System.out.println("통행료 : 1150원");
				} else if(distance <= 30) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 고속버스");
					System.out.println("통행료 : 1450원");
				} else {
					System.out.println("거리 : " + distance +"km");
					System.out.println("차종  : 고속버스");
					System.out.println("통행료 : " + (850+((int)distance/10)*300) + "원");
				}
			}
			else {
				if(distance <= 10) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 그 외");
					System.out.println("통행료 : 600원");
				} else if(distance <= 20) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 그 외");
					System.out.println("통행료 : 800원");
				} else if(distance <= 30) {
					System.out.println("거리 : " + distance + "km");
					System.out.println("차종  : 그 외");
					System.out.println("통행료 : 1000원");
				} else {
					System.out.println("거리 : " + distance +"km");
					System.out.println("차종  : 그 외");
					System.out.println("통행료 : " + (600+((int)distance/10)*200) + "원");
				}
			}

	}

}
