package day01;

public class ForForDemo{
    public static void main(String[] args){

        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"X"+j+"="+i*j+"  ");
            }
        }
        System.out.println();
    }
}