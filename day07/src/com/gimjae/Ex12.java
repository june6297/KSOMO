package com.gimjae;

public class Ex12 {

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
				input=inputMsg(sc, 0);
				int idx=getIndex(data, input);
				if(idx==-1) {
					stu[0]=input;
					for(int i=1; i<=4; i++)
						stu[i]=inputMsg(sc, i);
					data[cnt++]=stu;
				}else {
					System.out.println(input+"�й��� �����մϴ�");
				}
			}else if(input.equals("4")) {
				System.out.print("������ ");
				input=inputMsg(sc, 0);
				int idx=getIndex(data, input);
				if(idx>-1) {
					String[][] temp=new String[data.length][];
					System.arraycopy(data, 0, temp, 0, idx);
					System.arraycopy(data, idx+1, temp, idx, data.length-(idx+1));
					data=temp;
					cnt--;
				}else {
					System.out.println("�����ϴ� �й��Դϴ�");
				}
			}else if(input.equals("3")) {
				System.out.print("������ ");
				input=inputMsg(sc, 0);
				int idx=getIndex(data, input);
				if(idx==-1) {
					System.out.println("�����ϴ� �й��Դϴ�");
				}else {
					for(int i=1; i<=4; i++)
						data[idx][i]=inputMsg(sc, i);
				}
			}
			
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	static String inputMsg(java.util.Scanner sc,int su) {
		String[] msg= {"�й�","�̸�","����","����","����"};
		System.out.print(msg[su]+">");
		return sc.nextLine();
	}

	static int getIndex(String[][] data, String input) {
		int idx=-1;
		for(int i=0; i<data.length; i++) {
			if(data[i]!=null) {
				if(data[i][0].equals(input)) idx=i;
			}
		}
		return idx;
	}
}






















