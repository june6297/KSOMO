package com.gimjae;

/*
 * �л������������α׷�(ver 1.3.0)
 * 1.��� 2.�Է� 3.���� 4.���� 0.����>1
 * ------------------------------------
 * �й� |�̸�	|���� |���� |����
 * ------------------------------------
 *  
 * 1.��� 2.�Է� 3.���� 4.���� 0.����>2
 * �й�> 1
 * ����> ȫ�浿
 * ����> 90
 * ����> 80
 * ����> 70
 * 
 * 1.��� 2.�Է� 3.���� 4.���� 0.����>2
 * �й�> 1
 * �����ϴ� �й��Դϴ�
 * 
 * 1.��� 2.�Է� 3.���� 4.���� 0.����>3
 * �й�> 1
 * �����Ǿ����ϴ�.
 * 
 * 1.��� 2.�Է� 3.���� 4.���� 0.����>3
 * �й�> 1
 * �������� �ʽ��ϴ�
 * 
 * 
 * 
 * 
 * */


public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		String menu="1.��� 2.�Է� 3.���� 4.���� 0.����>";
		System.out.println("�л������������α׷�(ver 1.3.0)");
		String input=null;
		
		System.out.print("�ѿ�>");
		input=sc.nextLine();
		String[][] data=new String[Integer.parseInt(input)][];
		int cnt=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			
			if(input.equals("1")) {
				System.out.println("---------------------------------------------------");
				System.out.println("�й�\t|�̸�\t\t|����\t|����\t|����");
				System.out.println("---------------------------------------------------");
				for(int i=0; i<data.length; i++) {
					if(data[i]==null)continue;
					System.out.println(
							data[i][0]+"\t|"+data[i][1]+"\t\t|"+data[i][2]
									+"\t|"+data[i][3]+"\t|"+data[i][4]
							);
				}
				System.out.println("---------------------------------------------------");
				
			}else if(input.equals("2")&&cnt<data.length) {
				String[] stu=new String[5];
				System.out.print("�й�>");
				input=sc.nextLine();
				stu[0]=input;
				System.out.print("�̸�>");
				input=sc.nextLine();
				stu[1]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[2]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[3]=input;
				System.out.print("����>");
				input=sc.nextLine();
				stu[4]=input;
				data[cnt++]=stu;
			}else if(input.equals("4")) {
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int idx=-1;
				for(int i=0; i<data.length; i++) {
					if(data[i][0].equals(input)) idx=i;
				}
				if(idx>-1) {
					data[idx]=null;
					System.out.println("�����Ǿ����ϴ�.");
				}else {
					System.out.println("�����ϴ� �й��Դϴ�");
				}
			}else if(input.equals("3")) {
				System.out.print("������ �й�>");
				input=sc.nextLine();
				int idx=-1;
				for(int i=0; i<data.length; i++) {
					if(data[i][0].equals(input))idx=i;
				}
				if(idx==-1) {
					System.out.println("�����ϴ� �й��Դϴ�");
				}else {
					System.out.print("�̸�>");
					data[idx][1]=sc.nextLine();
					System.out.print("����>");
					data[idx][2]=sc.nextLine();
					System.out.print("����>");
					data[idx][3]=sc.nextLine();
					System.out.print("����>");
					data[idx][4]=sc.nextLine();
				}
			}
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}






















