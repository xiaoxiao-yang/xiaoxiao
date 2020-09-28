package com.spdb.aop;

/**
 * @Author Yang Qi
 * @Date 2020/8/26 14:19
 */
public class staticDemo {
    private int a,b;
    public static int c;


    public staticDemo(){
//        this.a1 = 0;
    }
    public staticDemo(int a, int b){
        this.a = a;
        this.b = b;
    }


    public void fun(){
        int a[]=new int[100];
        System.out.println("this is a small demo.");
    }

    public static void state(int a, int b){
        System.out.println(a+" "+ b);
    }

    public static void main(String[] args) {
        staticDemo a = new staticDemo(1,2);
        a.fun();
//        fun();
        System.out.println(String.valueOf('g'));
    }

}
class sub extends staticDemo{
    private int c;
    final int i;

    public sub(int a, int b,int c){
        super(a,b);
        this.c = c;
        i=0;
    }
    static class b{

    }
//    @Override
    public final void fun(){
//        private int a;
//        public class a{
//        }
        {
            int a;
        }

        final class c{
            int bb = 99;
        }
        System.out.println("heloo");
    }
}