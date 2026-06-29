import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
private static final int PORT=1234;
private static Vector<ClientHandler> clients=new Vector<>();
public static void main(String[] args)
{
try
{
ServerSocket serverSocket=new ServerSocket(PORT);
System.out.println("Server started......");
System.out.println("Waiting for clients.....");
while(true)
{
Socket socket=serverSocket.accept();
System.out.println("New client connected.");
ClientHandler client=new ClientHandler(socket,clients);
clients.add(client);
Thread thread=new Thread(client);
thread.start();
}
}
catch(IOException e)
{
e.printStackTrace();
}
}
}

