package day01;
///** ��������� */
//public class PageCounterDemo {
//  public static void main(String[] args) {
//    int rows = 41;// ����;
//    int size = 10;//ҳ���С
//    int pages = count(rows, size);//ҳ��
//    System.out.println(pages);//4
//  }
//  public static int count(int rows, int size){
//    return rows%size==0 ? rows/size : rows/size+1;
//
//  }
//}

public class PageCounterDemo{
  public static void main(String[] args){
    int rows = 41;
    int size = 10;
    int pages = count(rows, size);
    System.out.println(pages);
  }

  public static int count(int rows, int size){
    if (rows%size==0){
      return rows/size;
    }else{
      return rows/size + 1;
    }
  }
}
