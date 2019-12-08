package Chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements  Runnable{
    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectInputStream input;

    @Override
    public void run() {
        System.out.println("Server");
        try {
            serverSocket = new ServerSocket(8877);
            socket = serverSocket.accept();
            input = new ObjectInputStream(socket.getInputStream());
            System.out.println(input.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
