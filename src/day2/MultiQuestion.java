package day2;

import java.util.Arrays;

public class MultiQuestion extends Question{
    char[] answers;
    public MultiQuestion(String title, String[] options, char[] answers){
        this.title = title;
        this.options = options;
        this.answers = answers;

    }

    public boolean check(char[] answers){
        if (answers == null){
            return false;
        }
        return Arrays.equals(this.answers, answers);
    }
}