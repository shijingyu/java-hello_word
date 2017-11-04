package day2;
public class SingleQuestion extends Question {
    char answer;

    public SingleQuestion(String title, String [] options, char answer){
        //super(); 调用父类的构造器
        //this();  当前类中的构造器
        this.title = title;
        this.options = options;
        this.answer = answer;
    }

    public boolean check(char[] answers){
        if(answers == null || answers.length != 1){
            return false;
        }
        return this.answer == answers[0];
    }
}