package com.gimhae;

public class Ex05 {

	public static void main(String[] args) {
		// �ڷᱸ��
		// 1. ���� - ������ ����,�ߺ�����
		// 2. ���� - ������ ����,�ߺ��Ұ�
		java.util.HashSet set;
		set=new java.util.HashSet();
		
		set.add("ù��°");
		set.add("�ι�°");
		set.add("ù��°");
		set.add("����°");
		set.add("ù��°");
		
		java.util.Iterator ite=set.iterator();
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());

	}

}









