package com.gimhae;

public class Ex05 {
	static int[] arr2;
	static int[] arr3=null;

	public static void main(String[] args) {
		//��������
		int[] arr1;			// �迭���� ����
		arr1=new int[3];	// �ʱ�ȭ
//		arr1[0]=1111;
		arr1[1]=2222;
//		arr1[2]=3333;
		System.out.println(arr2);
		System.out.println(arr1.toString());
		
		Ex05 me =new Ex05();
		System.out.println(me);
		System.out.println(me.toString());
		System.out.println(me.getClass());
		System.out.println("@");
		System.out.println(Integer.toHexString(me.hashCode()));
	}

}















