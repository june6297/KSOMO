package com.gimhae;

import java.util.Enumeration;
import java.util.Vector;

public class Ex07 {

	public static void main(String[] args) {
		// 1.0~
		// ������ �ִ�...
		Vector vec=new Vector();
		vec.addElement("ù��°");
		vec.addElement("�ι�°");
		vec.addElement("����°");
		vec.addElement("�׹�°");
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i));
		}
		System.out.println("-------------------------");
		Enumeration eles = vec.elements();
//		while(eles.hasMoreElements()) {
//			System.out.println(eles.nextElement());
//		}
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		Object obj=eles.nextElement();
		obj="����";
		System.out.println(eles.nextElement());
	
		eles=vec.elements();
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		
	}

}










