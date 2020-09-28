package com.spdb.tutorialspoint;

/**
 * @Author Yang Qi
 * @Date 2020/8/12 14:32
 */


public class HelloWorld {

        private String message1;
        private String message2;
        public void setMessage1(String message){
            this.message1  = message;
        }
        public void setMessage2(String message){
            this.message2  = message;
        }
        public void getMessage1(){
            System.out.println("World Message1 : " + message1);
        }
        public void getMessage2(){
            System.out.println("World Message2 : " + message2);
        }

    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
