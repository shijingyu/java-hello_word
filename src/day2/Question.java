package day2;
public class Question{
    String title; //题干
    String[] options; //选项

    public void print(){

        System.out.println(this.title);
        for(int i =0; i<this.options.length;i++){
            String option = this.options[i];
            System.out.print("\t"+ option);
        }
        System.out.println();
    }

    public boolean check(char[] answers){
        return false;
    }
}