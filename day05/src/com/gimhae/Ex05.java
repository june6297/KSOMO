package com.gimhae;

public class Ex05 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		/*
		 * �ֹι�ȣ üũ(ver 0.1.0)
		 * 
		 * �ֹι�ȣ> 991231-1234567
		 * ����� 00�� �����Դϴ�.
		 * ------------------------------------
		 * �ֹι�ȣ> 1234561234567
		 * ������ ������� 000000-0000000���� �Է��ϼ���
		 * �ֹι�ȣ> 123456-123456
		 * �Է��ڸ����� �����մϴ�
		 * �ֹι�ȣ> a12345-1234567
		 * �ֹι�ȣ�� ���ڷθ� �����Ǿ�� �մϴ�
		 * 
		 */
		int age=0;
		char gender='��';
		System.out.println("�ֹι�ȣ üũ(ver 0.1.0)");
		String input="";
		char[] arr1;
		do {
			boolean[] boo= {true, true, true};
			System.out.print("�ֹι�ȣ> ");
			input=sc.nextLine();
			arr1=input.toCharArray();
			if(arr1[6]!='-')boo[0]=false;
			if(arr1.length!=14)boo[1]=false;
			// '0'<=����<='9'
			for(int i=0; i<arr1.length; i++) {
				if(i!=6) {
					if(arr1[i]<'0' || arr1[i]>'9')boo[2]=false;
				}
			}
			
			if(boo[0]&&boo[1]&&boo[2]) { 
				break;
			}else if(!boo[0]) {
				System.out.println("������ ������� 000000-0000000���� �Է��ϼ���");
			}else if(!boo[1]) {
				System.out.println("�Է��ڸ����� �����մϴ�");
			}else if(!boo[2]) {
				System.out.println("�ֹι�ȣ�� ���ڷθ� �����Ǿ�� �մϴ�");
			}
		}while(true);
		int year=1900+(arr1[0]-'0')*10+(arr1[1]-'0');
		
		if(arr1[7]%2=='2'%2) {gender='��';}
		
		age=2024-year+1;
		if(arr1[7]>'2') {age-=100;}
		System.out.println("����� "+age+"�� "+gender+"���Դϴ�.");

	}

}











