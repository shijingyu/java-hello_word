package day01;

public class VarDemo {
  public static void main(String[] args) {
    //System.out.println(age);//编译错，变量没有声明
    int age;//变量的声明
    //System.out.println(age);//编译错，变量没有初始化
    age = 15;//变量的初始化, 第一次赋值

    byte  s=14;// int -->byte

    System.out.println(age);//输出15
    age = 16;//赋值，更改变量的值
    System.out.println(age);//16
    int times = 10;//声明同时初始化
    System.out.println(times);

    //int age;//编译错误，变量重复声明
    if(age<20){
      int score = 10;
      System.out.println(score);//10
    }//变量离开作用域就回收  JVM控制回收机制
    //System.out.println(score);//编译错误，没有声明
    int score = 5;
    System.out.println(score);//5
  }
}



