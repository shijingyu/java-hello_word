package day04;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo{
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        list.add('石');
        list.add(1);
        list.add('景');
        list.add(3,'宇');
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object c = it.next();
            System.out.println("it" + c);
        }
    }
}