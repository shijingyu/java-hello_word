package day04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManageDemo{
    public static void main(String[] args){
        List list = new ArrayList();    //存放已经注册的用
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.print("R : 注册， L ：登录");
            String x = console.nextLine();
            if("R".equals(x)){
                System.out.print("email");
                String email = console.nextLine();
                System.out.print("password");
                String password = console.nextLine();
                User u = new User(email, password);
                list.add(u);
                System.out.println("注册成功");

            }else if("L".equals(x)){
                System.out.print("输入邮箱");
                String email = console.nextLine();
                User u = new User();
                u.setEmail(email);

            }
    }
    }
}