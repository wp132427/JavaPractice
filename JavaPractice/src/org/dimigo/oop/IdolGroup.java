package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		String[] idolGroup = {"���", "2NE1", "�ɽ�����"};
		String[][] members = {
				{"GD", "�¾�", "�뼺", "ž", "�¸�"}, {"CL", "��ٶ��", "�ں�", "����"}, {"����", "����", "����", "�ξ�"}
		};
		
		for(int i = 0; i < idolGroup.length; i++) {
			System.out.println("<< " + idolGroup[i] + " ���>>");
				for(int j = 0; j < members[i].length; j++) {
					System.out.println(members[i][j]);
				}
			}
	}

}
