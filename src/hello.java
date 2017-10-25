

import static java.lang.System.*;
public class hello{

    public static void main(String[] args){

        float af = 2.34444444f;
        System.out.println(af);
        byte a = 2;
        System.out.println(a);
        boolean b2 = true;
        System.out.println(b2);
        int aa = 22;
        float fa = aa;
        System.out.println(fa);
        System.out.println("ssdsds:"+(5 > 3.0));
        String str = 5 > 3 ? "5dayu3" :"5budayu3";
        System.out.println(str);

        int age = 230;
        int many = 20;
        if(age > 20){
            System.out.println("my age is "+ age);

        }
        else{
            System.out.println("my age is small");

        }

        if (many > 20){

            System.out.println("qingnian");
        }
        else if(many == 20){

            System.out.println("hahah");
        }
        else if (many < 20){

            System.out.println("sd");
        }
        char score = 'C';
        switch(score){
            case 'A':
                System.out.println("youxi");
                break;
            case 'C':
                System.out.println("aa");
                break;
            default:
                System.out.println("buduibudui");

        }
//        int count = 0;
//        while(count < 10){
//
//            System.out.println(count);
//            count++;
//
//        }
        int count = 1;
        do {
            System.out.println(count);
            count++;
        }
        while(count<10);
        //System.out.println(count);

        for(count = 0; count < 10; count++){

            System.out.println(count);
        }
        System.out.println("xunhuanjiehu!");

        count = 0 ;
        System.out.println(count);

        for (; count<10;){
            count++;
            System.out.println(count);
        }

        int[] intArr;
        intArr = new int[]{5, 6, 8, 10};
        Object[] objArr;
        objArr = new Object[]{"java", "python", "PHP"};

        int[] intAAAA;
        intAAAA = new int[]{12,34,56,34};

        System.out.println(objArr[1]);

        int[]prices = new int[5];
        prices[0] = 12;
        prices[2] = 33;

        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);

        }

        String[] books = {"book1", "book2", "book3", "boooook"};
        for(String book : books){
            System.out.println(book);

        }




        Dog pp = new Dog();
        pp.run();

        TestPrimitiveTransfer ppp = new TestPrimitiveTransfer();
        ppp.test(5, "book1","book2","book3");

        Recursive pppp = new Recursive();
        pppp.fn(2);
        out.println(pppp.fn(2));

        Overload ol = new Overload();
        ol.test();
        ol.test("oooolll");


//        System.out.println("Person eyenum is" + Person.eyeNum);
//        Person p = new Person();
//        System.out.println("name is " + p.name + "   eyenum is " + p.eyeNum);
//        p.name = "p de name is sunwukong";
//        p.eyeNum = 2;
//        System.out.println("p its name is" + p.name + "p its shuxing " + p.eyeNum);
//
//        Person p2 = new Person();
//        System.out.println(p2.eyeNum );
//        System.out.println(p2.name);

//        Person p = new Person();
//
//        out.println("age = "+ p.getAge());

        BaseClass bc = new BaseClass();
        out.println(bc.book);
        bc.base();
        bc.test();
        SubClass sc = new SubClass();
        out.println(sc.book);

//        bc.test();
//        out.println(bc.book);
        sc.base();
        sc.test();
        BaseClass plo = new SubClass(); //编译时 是父类，运行时是子类  子类对象 父类变量
        out.println(plo.book);          //输出父类属性
        plo.base();
        plo.test();                     //输出子类覆盖（重写）方法

        RedTea qw = new RedTea();
        qw.ff();

    }

}

