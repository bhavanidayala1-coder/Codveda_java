import java.sql.*;
public class ReturnDAO
{
public void returnBook(int bookId)
{
try
{
Connection con=DBConnection.getConnection();
String query="UPDATE books SET available=true WHERE id=?";
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1,bookId);
int rows=ps.executeUpdate();
if(rows > 0)
{
System.out.println("Book returned successfully!");
}
else
{
System.out.println("Book not found.");
}
con.close();
}
catch (Exception e)
{
e.printStackTrace();
}
}
}
