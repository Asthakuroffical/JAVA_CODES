import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = a/b;
        int r = a%b;
        for (int i = 0; i<b-r; i++){
            System.out.print(q);
        }
        for(int i = 0; i<r; i++){
            System.out.print(q+1);
        }
    }
}