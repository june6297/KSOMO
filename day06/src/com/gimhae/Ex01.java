package com.gimhae;

public class Ex01 {

	public static void main(String[] args) {
		// Q1. �ֹι�ȣ üũ��(ver 0.2.0)
		// �ֹι�ȣ> 
		// ## ���ں�ȯ �޼��带 ���� 
		final String VERSION="0.2.0";
		String title="�ֹι�ȣ üũ��(ver "+VERSION+")";
		String menu="�ֹι�ȣ> ";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		System.out.println(title);
		String input="";
		int age=0;
		char gender='��';
		char[] arr;
		int year=1900;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			arr=input.toCharArray();
			if(arr[6]!='-')continue;
			if(arr.length!=14)continue;
			boolean re=true;
			for(int i=0; i<arr.length; i++) {
				if(i==6)continue;
				if(!checkSu(arr[i]))re=false;
			}
			if(!re)continue;
			year+=changeSu(arr[0])*10+changeSu(arr[1]);
			if(arr[7]>'2')year+=100;
			age=2024-year+1;
			if(arr[7]%2=='1'%2)gender='��';
			break;
		}
		System.out.println("����� "+age+"�� "+gender+"�� �Դϴ�.");
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static boolean checkSu(char ch) {
		if(ch<'0')return false;
		if(ch>'9')return false;
		return true;
	}
	
	public static int changeSu(char ch) {
		if(ch=='-')return '-';
		return ch-'0';
	}

}








