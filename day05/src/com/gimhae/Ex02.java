package com.gimhae;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열
        // 문자들의 집합
        // "" 빈문자 - 빈집합
        // + 연산가능
        java.lang.String msg1="hello";//참조변수
        System.out.println(msg1);
        String msg2=new String("hello");
        System.out.println(msg2);
        char[] ch=new char[5];
        ch[0]='H';
        ch[1]='E';
        ch[2]='L';
        ch[3]='L';
        ch[4]='O';
        String msg3=new String(ch);
        System.out.println(msg3);

        byte[] byt=new byte[3];
        byt[0]=65;
        byt[1]=66;
        byt[2]=67;
        String msg4=new String(byt);
        System.out.println(msg4);
    }
}
