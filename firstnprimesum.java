import java.util.Scanner;
public class firstnprimesum{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no");
    int n = sc.nextInt();
    int j;
    int flag;
    int s=0;
    int c=0;
    int i=2;
    while(c<n)
    {
        flag=0;
        for(j=2;j<=i-1;j++)
        {
            if(i%j==0)
            flag=1;
        }
        if(flag==0)
        {
            s=s+i;
            c=c+1;
        }
        i=i+1;
    }
     System.out.print("Value of sum"+s);
    }

   }

