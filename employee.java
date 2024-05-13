public class employee
{
public static void main(String args[])
{
employees e1 = new employees("Naincy Kumari",109,250000,"Executive");
employees e2 = new employees("Esheta");
employees e3 = new employees();
System.out.println(e1.getName() + " "+ e1.getId() + " "+ e1.getDesignation()+ " " + e1.getSalary());
System.out.println(e2.getName() + " "+ e2.getId() + " "+ e2.getDesignation()+ " " + e2.getSalary());
System.out.println(e3.getName() + " "+ e3.getId() + " "+ e3.getDesignation()+ " " + e3.getSalary());
e1.print_count();
employees e4 = new employees();
e4 = e1.compare(e1,e2);
System.out.println("The name of the employee having higher salary is "+ e4.getName());
e1.inc_sal(100);
e2.inc_sal(10,20);
System.out.println("Incresed salary of employee 1 is "+e1.getSalary());
System.out.println("Incresed salary of employee 2 is "+e2.getSalary());
e1.new_name("Bishal");
}
}
class employees
{
static int emp_count =0;
public employees(String n, int i, int s, String d)
{
name= n;
emp_count++;
emp_id=emp_count;
salary = s;
designation =d;
}
public employees(String n)
{
name= n;
emp_count++;
emp_id=emp_count;
salary = 10000;
designation = "Fresher";
}
public employees()
{
name= "Shyam Aggrawal";
emp_count++;
emp_id=emp_count;
salary = 5000;
designation = "Temporary Member";
}
private final String name;
private String designation;
private int salary;
private int emp_id;
public String getName(){
return name;
}
public String getDesignation(){
return designation;
}
public int getId(){
return emp_id;
}
public int getSalary(){
return salary;
}
public void updateSalary(int m){
salary = salary+ m;
}
public static void print_count()
{
System.out.println("Number of employees in the company are :"+ emp_count);
}
public static employees compare(employees a, employees b)
{
if (a.salary >= b.salary) {
return a;
}
else{
return b;
}
}
public void inc_sal(int p)
{
salary = salary + (salary*p)/100;
}
public void inc_sal(int p,int b)
{
salary = salary + (salary*p)/100 + b;
}
public void new_name(String n)
{
name = n;
}
}
