package com.gimhae;

public class Ex05 {

	public static void main(String[] args) {
		// 자료구조
		// 1. 선형 - 순서가 있음,중복가능
		// 2. 비선형 - 순서가 없음,중복불가
		java.util.HashSet set;
		set=new java.util.HashSet();
		
		set.add("첫번째");
		set.add("두번째");
		set.add("첫번째");
		set.add("세번째");
		set.add("첫번째");
		
		java.util.Iterator ite=set.iterator();
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());
		System.out.println(ite.next());

	}

}









