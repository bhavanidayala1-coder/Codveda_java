import java.sql.*;

public class BookDAO
{
public void addBook(Book book)
{
try
{
Connection con=DBConnection.getConnection();
String query="Insert INTO books(title,author,available)VALUES(?,?,?)";
PreparedStatement ps=con.prepareStatement(query);
ps.setString(1, book.getTitle());
ps.setString(2, book.getAuthor());
ps.setBoolean(3, book.isAvailable());
ps.executeUpdate();
System.out.println("Book added successfully!");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}


