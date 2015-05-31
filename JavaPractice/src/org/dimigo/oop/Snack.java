package org.dimigo.oop;

public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void PrinkSnack()
	{
		System.out.println("�̸� : " + getName());
		System.out.println("������ : " + getCompany());
		System.out.println("���� : " + String.format("%,d", getPrice())+"��");
		System.out.println("���� : " + getNumber()+"��");
		System.out.println();
	}
	
	public int calcPrice()
	{
		int a;
		a = getPrice() * getNumber();
		return a;
	}
}
