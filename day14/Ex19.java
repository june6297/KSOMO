package com.day14;

import java.io.*;

public class Ex19 {
	public static void main(String[] args) throws IOException{
		// 학생성적관리프로그램 (0.10.0)
		// IO - 종료 후 재시작 시 데이터 유지
		// 1.보기 2.입력 (3.삭제) 0.종료
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("\n학생성적관리프로그램 (0.10.0)");
			System.out.println("1.보기 2.입력 3.삭제 0.종료");
			int a = Integer.parseInt(br.readLine());
			
			if(a==0) break;
			if(a==1) {
				File d = new File("C:\\Users\\Student\\Desktop\\Java");
				File[] arr = d.listFiles();
				System.out.print("열람 가능한 학생 이름 : ");
				for(int i=0;i<arr.length;i++) {
					String[] arr2 = arr[i].getName().split("\\.");
					if(arr2.length==2&&arr2[1].equals("txt")) {
						System.out.print(arr2[0]+" ");
					}
				}
				System.out.println();
				try {
					System.out.println("학생 이름을 입력하세요");
					
					File f = new File(br.readLine()+".txt");
					Reader r= new FileReader(f);
					while(true) {
						int b = r.read();
						if(b==-1)break;
						System.out.print((char)b);
					}
					System.out.println();
					r.close();
				}catch(FileNotFoundException e) {
					System.out.println("해당 학생은 존재하지 않습니다.");
				}
			}
			if(a==2) {
				System.out.println("학생 이름을 입력하세요");
				String name = br.readLine();
				System.out.println("학번을 입력하세요");
				String sn = br.readLine();
				System.out.println("국어 점수를 입력하세요");
				String kor = br.readLine();
				System.out.println("영어 점수를 입력하세요");
				String eng = br.readLine();
				System.out.println("수학 점수를 입력하세요");
				String math = br.readLine();
				
				String msg = "이름:"+name+"\t학번:"+sn+"\t국어:"+kor+"\t영어:"+eng+"\t수학:"+math;
				byte[] arr = msg.getBytes();
				File f = new File(name+".txt");
				
				OutputStream os = new FileOutputStream(f);
				os.write(arr);
				System.out.println("작성 완료");
				os.close();
			}
			if(a==3) {
				File d = new File("C:\\Users\\Student\\Desktop\\Java");
				File[] arr = d.listFiles();
				System.out.print("삭제 가능한 학생 이름 : ");
				for(int i=0;i<arr.length;i++) {
					String[] arr2 = arr[i].getName().split("\\.");
					if(arr2.length==2&&arr2[1].equals("txt")) {
						System.out.print(arr2[0]+" ");
					}
				}
				System.out.println();
				try {
					System.out.println("삭제할 학생의 이름을 작성하세요");
					File f = new File(br.readLine()+".txt");
					boolean result = f.delete();
					System.out.println("해당 학생의 정보가 삭제되었습니다.");
				}catch(FileNotFoundException e) {
					System.out.println("해당 학생은 존재하지 않습니다.");
				}
			}
		}
	}
}
