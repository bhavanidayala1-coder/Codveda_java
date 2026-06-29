import java.util.Scanner;
public class LibraryManagementSystem
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
BookDAO bookDAO=new BookDAO();
BorrowDAO borrowDAO=new BorrowDAO();
ReturnDAO returnDAO=new ReturnDAO();
while(true)
{
System.out.println("\n======= Library Management System =======");
System.out.println("1.Add Book");
System.out.println("2.Borrow Book");
System.out.println("3.Return Book");
System.out.println("4.Exit");
System.out.println("Enter your choice: ");
int choice=sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
System.out.print("Enter Book Title: ");
String title=sc.nextLine();
System.out.print("Enter Author Name: ");
String author=sc.nextLine();
Book book=new Book(0,title,author,true);
bookDAO.addBook(book);
break;
case 2:
System.out.print("Enter Book ID: ");
int borrowId=sc.nextInt();
borrowDAO.borrowBook(borrowId);
break;
case 3:
System.out.print("Enter Book ID: ");
int returnId=sc.nextInt();
returnDAO.returnBook(returnId);
break;
case 4:
System.out.println("Thank you!");
sc.close();
System.exit(0);
default:
System.out.println("Invalid choice!");
}
}
}
}


