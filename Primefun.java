import java.util.Scanner;
public class Primefun {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 2 numbers");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int i;
    System.out.println("The prime numbers are");
    for(i = x; i<=y; i++)
    {
        if(isPrime(i))
        {
            System.out.println(i);
        }
    }         
    }
    static boolean isPrime(int n)
    {
        int j,f;
        f=0;
        for(j=2;j<=n-1;j++)
        {
            if(n%j == 0)
              f=1;
            
        }
        if(f==0)
        {
            return true;
        }
        return false;


    }
    
}
