import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r;
        int c=0;
        while(n != 0)
        {
            r=n%10;
            if(r==7)
              c=c+1;
            n=n/10;

        }
        System.out.println(c);
        }
    
}
