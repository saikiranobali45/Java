import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Age of a Person:");
        int age = s.nextInt();
        if (age < 18) {
            System.out.println("Age is " + age + " not eligible to vote");
        }
        System.out.println("Due to Invalid Input Execution Failed!!!");
    }
}