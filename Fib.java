import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the range");
        n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int c,i;
        for(i=2;i<=n-1;i++)
        {
          c=a+b;
          System.out.println(c);
          a=b;
          b=c;
        }
    }
    
}
