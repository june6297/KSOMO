package com.gimhae;

public class Ex03 {

	public static void main(String[] args) {
		// �迭�� ����� �����Ҵ�
		// �̷� - Read���� Create,Update,Delete�Ҹ�
		
		java.util.List list;
		list=new java.util.LinkedList();
		list.add("ù��°");
		list.add("�ι�°");
		list.add("ù��°");
		list.add("����°");
		list.add("ù��°");

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
