package com.gimhae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.6.0)
		// 1.��� 2.�Է� 3.���� 4.���� 0.����>
		Scanner sc=new Scanner(System.in);
		String menu="1.��� 2.�Է� 3.���� 4.���� 0.����>";
		System.out.println("�л������������α׷�(ver 0.6.0)");
		List data=new ArrayList();
		String input;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("------------------------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����");
				System.out.println("------------------------------------------");
				for(int i=0; i<data.size();i++) {
					if((i+1)%5==0)System.out.println(data.get(i));//4,9,14
					else System.out.print(data.get(i)+"\t");
				}
				System.out.println("------------------------------------------");
			}
			if(input.equals("2")) {
				System.out.print("�й�>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("�̸�>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("����>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("����>");
				input=sc.nextLine();
				data.add(input);
				System.out.print("����>");
				input=sc.nextLine();
				data.add(input);
			}
			if(input.equals("4")) {
				System.out.print("������ �й�>");
				input=sc.nextLine();
				for(int i=0; i<data.size(); i+=5) {
					if(input.equals(data.get(i))) {
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
						data.remove(i);
					}
				}
			}
		}
		System.out.println("�����մϴ�");
	}

}









