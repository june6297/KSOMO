package com.gimjae;

public class Ex14 {

	public static void main(String[] args) {
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>";
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 1.4.0)");
		int tot=3;
		String input=null;
		Stu[] data=new Stu[tot];
		int cnt=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0"))break;
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------");
				System.out.println("�й�\t|�̸�\t|����\t|����\t|����\t|�հ�\t|���");
				System.out.println("--------------------------------------------------");
				for(int i=0; i<data.length; i++) {
					Stu stu=data[i];
					if(stu!=null) {
						System.out.println(stu.num+"\t|"+stu.name+"\t|"+stu.kor+"\t|"
						+stu.eng+"\t|"+stu.math+"\t|"+stu.getTot()+"\t|"+stu.getAvg());
					}
				}
				System.out.println("--------------------------------------------------");
			}
			if(input.equals("2")) {
				Stu stu=new Stu();
				System.out.print("�̸�>");
				stu.name=sc.nextLine();
				System.out.print("����>");
				stu.kor=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.eng=Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.math=Integer.parseInt(sc.nextLine());
				data[cnt++]=stu;
			}
			if(input.equals("3")) {}
			if(input.equals("4")) {}
		}
		
	}
}
