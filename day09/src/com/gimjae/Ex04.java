package com.gimjae;

public class Ex04 {

	public static void main(String[] args) {
		// 10���� �Ǽ�
		double su1=3.14;
		Double su2=new Double("3.14");
		Double su3=new Double(3.14);
		Double su4=new Double(3);
		Double su5=new Double("12");
		double su6=su5;
		Double su7=su6;
		double su8=Double.parseDouble("3.14");
		System.out.println(su8);
		su1=0.0;
		su2=0.0;
		/* +		-
		 * 3/1		1/4
		 * 2/1		1/2
		 * 1/1		1/1
		 * 0.5/1	1/0.5
		 * 			1/0.2
		 * 
		 * -		+
		 * */
		
		
		System.out.println(Double.isInfinite(su1/su2));
		System.out.println(Double.isNaN(su1/su2));
		double su9=su1/su2;
		System.out.println(su9);
	}

}









