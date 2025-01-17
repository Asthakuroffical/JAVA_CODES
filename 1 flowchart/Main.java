import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLZ ENTER your first answer ");
        int a = sc.nextInt();
        System.out.println("PLZ ENTER your Second answer ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("this addition of a + b = " + sum);
    }
}