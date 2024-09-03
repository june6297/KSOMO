package day04;

/* 
 * Call method
 * static   ->  static          [패키지.클래스명.]메서드명
 * static   ->  non-static      참조변수.메서드명
 * non-static-> static          [패키지.클래스명.]메서드명
 * non-static-> non-static      [this.]메서드명
 * 
 */
public class Ex07 {
    public static void main(String[] args) {
        day04.Ex07.func01();

        Ex07 me=new Ex07();
        Ex07 you=new Ex07();
        Ex07 me2=me;
        System.out.println(me==you);
        System.out.println(me==me2);

        me.func02(me);
    }
    public static void func01(){
        System.out.println();
    }
    public void func02(Ex07 me3){
        // this.func03();
        System.out.println(me3==this);
    }
    public void func03(){
        System.out.println("f3");
    }
}
