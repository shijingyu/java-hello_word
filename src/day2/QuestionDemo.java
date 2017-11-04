package day2;


import java.util.Scanner;

public class QuestionDemo{
    public static void main(String[] args){
        Question[] paper = {null, null};

        paper[0] = new SingleQuestion("Java 特点是",new String[]{"A 面向过程","B 多线程","C 与C语言一样","D 是咖啡品种"}, 'B');
        paper[1] = new MultiQuestion("Java基本类型包括", new String[]{"A String","B int","C long","D Boolean"}, new char[]{'B','C'});

        Scanner console = new Scanner(System.in);


        for(int i = 0; i < paper.length; i++){
            Question question = paper[i];
            Question question1 = new Question();
//            question1.titile = '';
//            question1.options= '';
//            question1.check()
            question.print();
            System.out.print("请选择");
            String ans = console.nextLine();
            char[] answers = ans.toCharArray();
            if(question.check(answers)){
                System.out.println("行呀");
            }else {
                System.out.println("还需努力");
            }

        }
    }
}