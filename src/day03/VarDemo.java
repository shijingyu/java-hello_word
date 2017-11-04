package day03;
public class VarDemo{
    public static void main(String[] args){

        int i = 10;
       // i = add(i);                   //11
        add(i);
        Demo d = new Demo();
        add(d);
        System.out.println(i);         //10
        System.out.println(d.i);        //11
        System.out.println(d);
        System.out.println(d.toString());

        Demo d1 = new Demo();
        d1.i = 11;
        d1.j = 12;
        System.out.println(d.equals(d1));   //false
        System.out.println(d==d1);          //false
    }

    public static int add(int i){
        i = i + 1;
        return i;
    }
    public static int add(Demo d){
        d.i = d.i + 1;
        return  d.i;
    }

    static class Demo{
        int i = 10;
        int j = 11;
        String name = "aa";
        @Override
        public String toString() {
            return "[i="+this.i+"，j="+this.j+",name="+this.name+"]";
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null){
              return false;
            }
            if(obj instanceof Demo){
                Demo obj1 = (Demo)obj;
                Boolean flag = obj1.i == this.i && obj1.j == this.j && obj1.name.equals(this.name);
                return flag;
            }else{
                return false;
            }

        }

        @Override
        public int hashCode() {
            return i*100 + j*1000;
        }
    }

}
