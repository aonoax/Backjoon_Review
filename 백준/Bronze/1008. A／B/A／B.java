import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0, b = 0;
        a = (int)sc.nextDouble();
        b = (int)sc.nextDouble();
        
        System.out.println(a/b);
    }
}