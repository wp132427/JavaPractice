package org.dimigo.oop;

public class SnackTest {

	static int cal = 0;
	public static void main(String[] args) {
		Snack[] snacks = new Snack[]{new Snack("»õ¿ì±ø", "³ó½É" , 1100, 2),new Snack("ÄÜ¯…", "Å©¶ó¿î" , 1200, 1), new Snack("Çã´Ï¹öÅÍÄ¨", "ÇØÅÂ" , 1500, 4)};
		
		for(Snack i : snacks){
			i.PrinkSnack();
			cal += i.calcPrice();
		}
		System.out.println("ÃÑ ±¸¸Å ±Ý¾×: " + String.format("%,d", cal) +"¿ø");
	}
}