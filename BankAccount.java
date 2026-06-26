import java.util.Scanner;
public class BankAccount
{
double balance=0;
public void deposit(double amount)
{
balance+=amount;
System.out.println("Amount Deposited:"+amount);
}
public void withdraw(double amount)
{
if(amount>balance)
{
System.out.println("Insufficient Balance!");
}
else
{
balance-=amount;
System.out.println("Amount Withdrawn:"+amount);
}
}
public void checkBalance()
{
System.out.println("Current Balance:"+balance);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BankAccount account=new BankAccount();
int choice;
do
{
System.out.println("\n=========Banking system======");
System.out.println("1 Deposit");
System.out.println("2 Withdraw");
System.out.println("3 Check Balance");
System.out.println("4 Exit");
System.out.print("Enter your choice:");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.print("Enter amount to deposit:");
double depositAmount=sc.nextDouble();
account.deposit(depositAmount);
break;
case 2:
System.out.println("Enter amount to withdraw:");
double withdrawAmount=sc.nextDouble();
account.withdraw(withdrawAmount);
break;
case 3:
account.checkBalance();
break;
case 4:
System.out.println("Thank you for using the Banking System.");
break;
default:
System.out.println("Invalid choice!");
}
}
while(choice != 4);
sc.close();
}
}



