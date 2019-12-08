import Chat.Client;
import Chat.Server;

public class Main {
    public static void main(String[] args) {
        //Client client = new Client();
        Server server = new Server();
        //Thread t1 = new Thread(client);
        Thread t2 = new Thread(server);

        //t1.start();
        t2.start();
//        System.out.println("Chat");
    }
}
