import java.io.*;
import java.net.*;

public class Client
{
public static void main(String[] args)
{
try
{
Socket socket=new Socket("localhost",1234);
BufferedReader keyboard=new BufferedReader(newInputStreamReader(System.in));
BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
Thread receiveThread=new Thread(new Runnable()
{
@Override
public void run()
{
try
{
String message;
while((message=in.readLine())!=null)
{
System.out.println(message);
}
}
catch(IOException e)
{
e.printStackTrace();
}
}
});
receiveThread.start();
String message;
while((message=keyboard.readLine())!=null)
{
out.println(message);
}
socket.close();
}
catch(IOException e)
{
e.printStrakTrace();
}
}
}

