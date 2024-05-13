import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int salary;
      System.out.println("Enter the salary");
      salary = sc.nextInt();
      if(salary >= 10000 && salary < 20000)
       salary = salary + 1000;
      else if(salary >=20000)
       salary = salary + 2000;
       else
       salary = salary + 500;
       System.out.println("The new salary is "+salary);  
    }
    
}
