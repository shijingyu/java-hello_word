import java.util.Arrays;

//public class CountCharDemo {
////    案例1 : 统计一个字符在字符串中的所有位置.
////            字符串: 统计一个字符在字符串中的所有位置
////    字符: '字'
////    返回: {4,7}
//
//    public static void main(String[] args){
//        int[] ary = new int[1];
//        String s = "统计一个字符在字符串中的所有位置";
//        char c = '字';
//        for(int i = 0; i< s.length();i++){
//            char n=s.charAt(i);
//            if(c==n){
//                System.out.println(i);
//
//                ary = Arrays.copyOf(ary,ary.length+1);
//                ary[ary.length-1] = i;
//            }
//        }
//        System.out.println(Arrays.toString(ary));
//    }
//
//}

////    案例1 : 统计一个字符在字符串中的所有位置.
////            字符串: 统计一个字符在字符串中的所有位置
////    字符: '字'
////    返回: {4,7}
//
public class CountCharDemo{
    public static void main (String[] args){
        int[] ary = new int[1];
        String s = "统计一个字符在字符串中的所有位置";
        char a = '字';
        for(int i=0;i<s.length();i++){
            char n = s.charAt(i);
            if(n==a){
                System.out.println(i);
                ary = Arrays.copyOf(ary,ary.length+1);
                ary[ary.length-1] = i;
            }
        }
        System.out.println(Arrays.toString(ary));
    }
}