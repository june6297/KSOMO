package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		// ��ü�� Ȱ���� �����Ҵ�
		// CRUD
		// �̷� - Create,Update,Delete����, Read �Ҹ�
		java.util.LinkedList list;
		list=new java.util.LinkedList();
		list.add(1111);
		list.add(2222);
		list.add(3333);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
