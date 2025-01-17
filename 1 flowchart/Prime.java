import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        while(div<n){
            if(n%div==0){
                System.out.println("this is not prime");
                return;
            }
            div = div + 1 ;
        }
        System.out.println("this is prime number");
    }
}