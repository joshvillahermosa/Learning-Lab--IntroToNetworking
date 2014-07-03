package socketclient1;
//************************************************************************
//Joshua John Villahermosa
//Class: Computer Netowrking
//Name: Socket Client 1 (SocketClient1)
//---- Description: Simple socket client
//Date: 2/23/12
//************************************************************************
import java.io.*;
import java.net.*;
public class SocketClient1 {    
    public static void main(String[] args) throws Exception
    {
         SocketClient1 Client = new SocketClient1(); 
        //A contstructor of the main class it's self
        Client.run();
    }
    public void run() throws Exception
    {
        Socket Socket = new Socket ("localhost", 9999);
        //Uses 2 parameters, the host name/IP and port which must match with
        //the server port
        PrintStream PrntStrm = new PrintStream(Socket.getOutputStream());
        PrntStrm.println("Establed Connection to server socket, request "
                + "acknowledgment");
        BufferedReader Inp = new BufferedReader (new InputStreamReader
                (Socket.getInputStream()));
        String string = Inp.readLine();
        System.out.println(string);
        
        //Closes
        Inp.close();
        PrntStrm.close();
        Socket.close();
    }
}
