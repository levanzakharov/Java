import java.net.*;
import java.io.*;

public class Client
{  private Socket socket              = null;
    private DataInputStream  console   = null;
    private DataOutputStream streamOut = null;

    private Client(String serverName, int serverPort)
    {  System.out.println("Establishing connection. Please wait ...");
        try
        {  socket = new Socket(serverName, serverPort);
            System.out.println("Connected: " + socket);
            start();
        }
        catch(UnknownHostException uhe)
        {  System.out.println("Host unknown: " + uhe.getMessage());
        }
        catch(IOException ioe)
        {  System.out.println("Unexpected exception: " + ioe.getMessage());
        }
        String line = "";
        while (!line.equals(".bye"))
        {  try
        {  line = console.readLine();
            streamOut.writeUTF(line);
            streamOut.flush();
        }
        catch(IOException ioe)
        {  System.out.println("Sending error: " + ioe.getMessage());
        }
        }
    }
    public void start() throws IOException
    {  console   = new DataInputStream(System.in);
        streamOut = new DataOutputStream(socket.getOutputStream());
    }
    public void stop()
    {  try
    {  if (console   != null)  console.close();
        if (streamOut != null)  streamOut.close();
        if (socket    != null)  socket.close();
    }
    catch(IOException ioe)
    {  System.out.println("Error closing ...");
    }
    }
    public static void main(String args[])
    {  Client client = null;
        if (args.length != 2)
            System.out.println("Usage: java ChatClient host port");
        else
            client = new Client(args[0], Integer.parseInt(args[1]));
    }
}