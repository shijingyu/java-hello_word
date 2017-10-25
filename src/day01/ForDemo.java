package day01;

public class ForDemo {
	//����10���ڵ�ż���ĺ�
  public static void main(String[] args) {
    int sum=0;
    for(int i=0; i<10; i+=2){ //i=i+2
        sum+=i; //sum = sum+i;
    }
    System.out.println(sum); //20
    sum=add(10);
  }
  //����code���ڵ�ż����
  public static int add(int code){
	  int sum=0;
	  for(int i=0; i<code; i+=2){
		  sum=sum+1;
	  }
	  return sum;
  }
  
}



/*  sum  i  i<10  
 *   0   0  true
 *   0   2  true
 *   2   4  true
 *   6   6  true
 *  12   8  true
 *  20   10 false
 */










