package com.gimjae;

public class Ex02 {

	public static void main(String[] args) {
		// 10���� ����Ÿ��
		int su1=1111;
		Integer su2=new Integer(1111);
		Integer su3=new Integer("+1111");
		Integer su4=4444;	// ����ڽ�- ��üȭ
		int su5=new Integer(5555); // ��ڽ�
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE+"bit");
		System.out.println(Integer.SIZE/8+"byte");
		
		int su6=Integer.parseInt("6666");
		Integer su7=Integer.valueOf("130");
		byte su8=su7.byteValue();
		
		
		
		System.out.println(su1==su2);
		System.out.println(su1==su3);
		System.out.println(su2==su3);
		System.out.println(su2.equals(su3));
		System.out.println(su2.equals(1111));
		System.out.println(Integer.sum(1, 2));
		int su9=010;
		System.out.println(su9+"��  2����:"+Integer.toBinaryString(su9));
		System.out.println(su9+"��  8����:0"+Integer.toOctalString(su9));
		System.out.println(su9+"�� 16����:0x"+Integer.toHexString(su9));
		System.out.println(Integer.parseInt("10",2));
		System.out.println(Integer.parseInt("10",8));
		System.out.println(Integer.parseInt("10",16));
		System.out.println(Integer.parseInt("10",10));
		
		System.out.println(su2.compareTo(-56));
		System.out.println(Integer.compare(10,1));
	}

}












