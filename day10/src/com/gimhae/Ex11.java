package com.gimhae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu="1.��� 2.�Է� 3.���� 4.���� 0.����>";
		String title="�л������������α׷�(ver 0.7.0)";
		String input;
		List data=new ArrayList();
		
		System.out.println(title);
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("---------------------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t�հ�\t���");
				System.out.println("---------------------------------------------------------");
				for(int i=0; i<data.size(); i++) {
					String[] stu=(String[])data.get(i);
					System.out.print(stu[0]+"\t"+stu[1]+"\t"+stu[2]+"\t"+stu[3]+"\t"+stu[4]);
					int kor=Integer.parseInt(stu[2]);
					int eng=Integer.parseInt(stu[3]);
					int math=Integer.parseInt(stu[4]);
					System.out.println("\t"+(kor+eng+math)+"\t"+(kor+eng+math)*100/3/100.0);
				}
				System.out.println("---------------------------------------------------------");
			}
			if(input.equals("2")) {
				String[] stu=new String[5];
				System.out.print("�й�>");
				stu[0]=sc.nextLine();
				System.out.print("�̸�>");
				stu[1]=sc.nextLine();
				System.out.print("����>");
				stu[2]=sc.nextLine();
				System.out.print("����>");
				stu[3]=sc.nextLine();
				System.out.print("����>");
				stu[4]=sc.nextLine();
				data.add(stu);
			}
			if(input.equals("4")) {
				System.out.print("������ �й�>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i++) {
					String[] stu=(String[]) data.get(i);
					if(input.equals(stu[0]))data.remove(i);
				}
			}
		}
		System.out.println("�����մϴ�");
	}

}














