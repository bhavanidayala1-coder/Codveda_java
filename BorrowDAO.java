import java.sql.*;
public class BorrowDAO
{
public void borrowBook(int bookId)
{
try
{
Connection con=DBConnection.getConnection();
String query="UPDATE books SET available=false WHERE id=?";
PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1, bookId);
int rows=ps.executeUpdate();
if(rows>0)
{
System.out.println("Book borrowed successfully!");
}
else
{
System.out.println("Book not found.");
}
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}




