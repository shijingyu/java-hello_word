package day04;

import java.util.ArrayList;

public class NoName{
    public static void main(String [] args){
        NoNameOut out = new NoNameOut(){    //匿名内部类的类体
            public void print(){
                System.out.println(name);
                System.out.println(name);
            }
        };
        out.name="123";
        out.print();
    }
}



class NoNameOut{
    String name;
    public void print(){
        System.out.println(name);
    }
}