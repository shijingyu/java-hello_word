/**
 * Created by apple on 2017/5/24.
 */
public class Recursive {
    public static int fn(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 4;
        }
        else{
            return 2*fn(n-1)+fn(n-2);
        }

    }
}
