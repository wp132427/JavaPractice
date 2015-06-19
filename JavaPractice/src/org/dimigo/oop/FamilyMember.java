package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName)
	{
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName()
	{
		return this.memberName;
	}
	
	public static void printMemberCnt()
	{
		System.out.println("���� �� �ο��� : " + memberCnt + "��");
		System.out.println();
	}

}
