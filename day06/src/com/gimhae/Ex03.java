package com.gimhae;

public class Ex03 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 1.2.0)
		// 1.��� 2.�Է� 3.�󼼺��� 0.����>3
		// �й�> 1
		// ����> 90
		// ����> 80
		// ����> 70
		// �հ�> 000
		// ���> 00.00 (�Ҽ���°�ڸ�����)
		// ����> A(~90)
		// ����> B(~80)
		// ����> C(~70)
		// ����> D(~60)
		// ����> F(60�̸�)
		String title="�л������������α׷�(ver 1.2.0)";
		String menu="1.��� 2.�Է� 3.�󼼺��� 0.����>";
		String table="--------------------------------\n";
		table+="�й�\t����\t����\t����\n";
		table+="--------------------------------";
		
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		
		int input=-1;
		int cnt=0;
		System.out.println(title);
		System.out.print("�ѿ�>");
		input=sc.nextInt();
		int[][] data=new int[input][];
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println(table);
				for(int i=0; i<data.length; i++) {
					if(i<cnt) {
						int[] stu=data[i];
						System.out.println(i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2]);
					}
				}
			}
			if(input==2&&cnt<data.length) {
				int[] stu=new int[3];
				System.out.print("����>");
				stu[0]=sc.nextInt();
				System.out.print("����>");
				stu[1]=sc.nextInt();
				System.out.print("����>");
				stu[2]=sc.nextInt();
				data[cnt++]=stu;
			}
			if(input==3) {
				System.out.print("�й�>");
				input=sc.nextInt();
				int[] stu=data[input-1];
				int sum=stu[0]+stu[1]+stu[2];
				double avg=sum*100/3/100.0;
				System.out.println("--------------------------------");
				System.out.println("����:"+stu[0]+",����:"+stu[1]+",����:"+stu[2]);
				System.out.println("--------------------------------");
				System.out.println("�հ�:"+sum);
				System.out.println("���:"+avg);
				System.out.println("--------------------------------");
				System.out.print("����:");
				if(avg>=90)System.out.println("A");
				else if(avg>=80)System.out.println("B");
				else if(avg>=70)System.out.println("C");
				else if(avg>=60)System.out.println("D");
				else System.out.println("F");
				
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}













