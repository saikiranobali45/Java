import java.util.Scanner;
import java.util.Scanner.*;
public class User_Input {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner s=new Scanner(System.in);
        String name=s.next();
        System.out.println("Enter Your Age:");
        String age=s.next();
        System.out.println("My Name is:"+name);
        System.out.println("My Age is:"+age);
    }
}
