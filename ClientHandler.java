import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable
{
private Socket socket;
private Vector<ClientHandler>clients;
private BufferedReader in;
private PrintWriter out;
public ClientHandler(Socket socket,Vector<ClientHandler>clients)
{
this.socket=socket;
this.clients=clients;
try
{
in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
out=new PrintWriter(socket.getOutputStream(), true);
}
catch(IOException e)
{
e.printStackTrace();
}
}
public void run()
{
String message;
try
{
while((message=in.readLine()) !=null)
{
broadcast(message);
}
}
catch(IOException e)
{
System.out.println("Client disconnected.");
}
finally
{
try
{
socket.close();
}
catch(IOException e)
{
e.printStackTrace();
}
clients.remove(this);
}
}
private void broadcast(String message)
{
for(ClientHandler client : clients)
{
client.out.println(message);
}
}
}
