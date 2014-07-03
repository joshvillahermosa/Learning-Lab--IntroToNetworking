package socketserver1;
//************************************************************************
//Joshua John Villahermosa
//Class: Intro to computer Netowrking
//Name: Socket Server 1 (SocketServer1)
//---- Description: Simple Socket server
//Date: 2/23/12
//************************************************************************
import java.io.*;
import java.net.*;
public class SocketServer1 
{    
    public static void main(String[] args) throws Exception
    {
        SocketServer1 Server = new SocketServer1();
        Server.run();
    }
    public void run() throws Exception
    {
        ServerSocket ServerSocket = new ServerSocket(9999);
        //The Server Socket holds the port number that matches with the client 
        //Server
        Socket ServerSocketAccpt = ServerSocket.accept();
        BufferedReader Inp= new BufferedReader(new InputStreamReader
                (ServerSocketAccpt.getInputStream()));
        String string = Inp.readLine();
        System.out.println(string);
        
        if (string != null)
        {
        PrintStream Response = new PrintStream
                (ServerSocketAccpt.getOutputStream());
        Response.println("Message Acknowledged");
        }
        
        //Closes
        Inp.close();
        ServerSocketAccpt.close();
        ServerSocket.close();
    }
}
