public class Employee2
{
  private String name;
  private  int emp_id;
  private double salary;
  private String designation;
  static int emp_count = 0;  
  public Employee2()
  {
   emp_id = emp_count++;
  }
  public Employee2(String n)
  {
   name = n;
   emp_id = ++emp_count;
  }
   public Employee2(String n,double s,String d)
  {
   name = n;
   salary = s;
   designation =d;
   emp_id = ++emp_count;
   }
   public String getName()
   {
     return name;
   }

   public int getEmpid()
  {
   return emp_id;
  }
  public double getSalary()
  {
   return salary;
  }
  public String getDesignation()
  {
   return designation;
  }
  public void updateSalary(double p)
  {
   salary = salary + ((p/100)*salary);
  }
 public void updateSalary(double p,int b)
  {
   salary = (salary + ((p/100)*salary))+b;
  }
  public static void print_count()
  {
  System.out.println("No of employee is" + emp_count);
  }
  public static Employee2 Compare(Employee2 a, Employee2 b)
  {
    if(a.salary >= b.salary)
      return a;
    return b;
   }
  public static void main(String[] args)
  {
   
   Employee2 e1 = new Employee2("John",50000.00,"Executive Manager");
   e1.print_count();
    Employee2 e2 = new Employee2("Sam",60000.00,"Deputy Manager");
   e2.print_count();
   e1.updateSalary(10.0);
   e2.updateSalary(10.0,5000);
   System.out.println(e1.getName() + " " + e1.getSalary()+ " " + e1.getDesignation());
   System.out.println(e2.getName() +" " + e2.getSalary()+ " " + e2.getDesignation());
   System.out.println(Employee2.Compare(e1,e2).getName() + " " + "has higher salary");                                                                                                     
  }
}

