package com.gimjae;

public class Ex13 {

	public static void main(String[] args) {
		// �ζǹ�ȣ ������(ver 0.1.0)
		// 1,6,24,32,41,45
		// ����� ����9�� �� mbc
		// 1~45
		int[] lotto;
		int limit=45;
		lotto=new int[limit];
		for(int i=0; i<limit; i++) {
			lotto[i]=i+1;
		}
		System.out.println(java.util.Arrays.toString(lotto));
		int su=0;
		int temp=0;
		for(int i=0; i<10000; i++) {
			su=new Double(Math.random()*limit).intValue();
			temp=lotto[0];
			lotto[0]=lotto[su];
			lotto[su]=temp;
		}
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
		// �䱸����
		// 1. ������ ���ڸ� �̴´�(1~45)
		// 2. �ߺ��˻�
		// 3. ����
	}

}
















