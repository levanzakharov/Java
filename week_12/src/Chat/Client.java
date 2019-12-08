package Chat;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    private Socket socket;
    private ObjectOutputStream out;
    private String message;

    @Override
    public void run() {
        //System.out.println("Client");
        try {
            socket = new Socket(InetAddress.getByName("localhost"),8888);
            Scanner scan = new Scanner(System.in);
            message = scan.nextLine();
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(message);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
