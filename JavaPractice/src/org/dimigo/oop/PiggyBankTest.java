package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember Dad = new FamilyMember("아빠");
		FamilyMember Mom = new FamilyMember("엄마");
		FamilyMember Brother = new FamilyMember("남동생");
		FamilyMember Me = new FamilyMember("나");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(Dad, 10000);
		PiggyBank.putMoney(Mom, 20000);
		PiggyBank.putMoney(Brother, 30000);
		PiggyBank.putMoney(Me, 40000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(Me, 60000);
		
		PiggyBank.printBalance();
	}

}
