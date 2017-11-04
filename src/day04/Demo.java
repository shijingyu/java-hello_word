package day04;

class Out{
    private int age = 12;
    class In{   //内部类的主要作用访问外部类中的私有属性
        private int age = 13;
        public void print(){
            int age = 14;
            System.out.println("局部变量:" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out.this.age );
        }
    }
}

public class Demo{
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }

}