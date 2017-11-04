public class ForTestDemo{
    public static void main(String[] args){
        int num = 0;
        while(true){

            if(num>=50){
                break;
            }
            num++;
            if(num%3 != 0 && num%10!= 3){
                System.out.println(num);
            }
        }
    }
}