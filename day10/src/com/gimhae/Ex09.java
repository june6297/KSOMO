package com.gimhae;

import java.util.Deque;
import java.util.LinkedList;

public class Ex09 {

	public static void main(String[] args) {
		Deque stack=new LinkedList();

//		stack.offerFirst("ù��°");
//		stack.offerFirst("�ι�°");
//		stack.offerFirst("����°");
//		
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
//		System.out.println(stack.pollFirst());
		
		stack.offerLast("ù��°");
		stack.offerLast("�ι�°");
		stack.offerLast("����°");
		
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		
	}

}













