package day04;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{

    public static void main(String[] args){
        String s = "asdqwnpjcpqdwddqwdi1hjcwqd";
        Map map = new HashMap();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);

            }else {
                int count = (Integer) map.get(c) + 1;
                map.put(c, count);

            }
        }
        System.out.println(map);
    }
}