package com.gimhae;

public class Ex06 {

	public static void main(String[] args) {
		// ����
		java.util.List list;
		list=new java.util.ArrayList();
		

		list.add("ù��°");
		list.add("����°");
		list.add(1,"�ι�°");
//		list.clear();
		boolean boo1=list.contains("�׹�°");
		
		java.util.List list2;
		list2=new java.util.ArrayList();
		list2.add("ù��°");
		list2.add("�ι�°");
		list2.add("����°");
		
		System.out.println(list==list2);
		System.out.println(list.equals(list2));
		
		System.out.println(list.get(1));
		System.out.println(list.hashCode());
		System.out.println(list2.hashCode());
		
		System.out.println(list.indexOf("�ι�°"));
		System.out.println(list.lastIndexOf("�ι�°"));
		java.util.List list3=new java.util.ArrayList();
		System.out.println(list.isEmpty());
		System.out.println(list3.isEmpty());
		
//		System.out.println(list.remove(1));
//		System.out.println(list.remove("�ι�°"));
		
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.remove(1);
		
		list.set(1, "2��°");
		
		list3=list.subList(0, 2);
		Object[] arr=list.toArray();
//		String[] arr=list.toArray();
//		String[] arr3=(String[])(list.toArray());
		String[] arr2=new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			arr2[i]=(String)arr[i];
		}
		
		System.out.println(list3.toString());
		System.out.println(boo1);
		System.out.println(java.util.Arrays.toString(arr2));
	}

}







