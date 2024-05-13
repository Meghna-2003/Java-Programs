import java.util.Scanner;
public class Charcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        c = sc.next().trim().charAt(0);
        if(c >= 'A' && c<= 'Z')
        System.out.println("Upper case");
        else
        System.out.println("Lower Case");
    }
    
}
