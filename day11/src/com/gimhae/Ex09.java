package com.gimhae;

import java.util.Iterator;

public class Ex09 {

	public static void main(String[] args) {
		// (�̷�)����������
		// �ߺ��Ұ�
		java.util.Set<String> set=new java.util.HashSet<>();
		set.add("ù��°");
		set.add("�ι�°");
		set.add("����°");
		set.add("�ι�°");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String msg=ite.next();
			System.out.println(msg);
		}
	}

}
