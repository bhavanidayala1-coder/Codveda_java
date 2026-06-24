import java.util.*;

class Employee
{
int id;
String name;
double salary;

Employee(int id,String name,double salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
void display()
{
System.out.println("ID: "+id);
System.out.println("Name: "+name);
System.out.println("Salary: "+salary);
System.out.println("--------------------------------");
}
}
public class EmployeeManagementSystem
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Employee>employees=new ArrayList<>();
while(true)
{
System.out.println("\n1.Add Employee");
System.out.println("2.view Employees");
System.out.println("3.Exit");
System.out.println("Enter choice: ");
int choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter ID: ");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Name: ");
String name=sc.nextLine();
System.out.print("Enter Salary: ");
double salary=sc.nextDouble();
employees.add(new Employee(id,name,salary));
System.out.println("Employee Added! ");
break;
case 2:
if(employees.isEmpty())
{
System.out.println("No Employees Found!");
}
else
{
for(Employee emp:employees)
{
emp.display();
}
}
break;
case 3:
System.out.println("Invalid Choice!");
}
}
}
}
