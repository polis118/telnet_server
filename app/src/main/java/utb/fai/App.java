package utb.fai;

import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));
            ExecutorService executorService = Executors.newFixedThreadPool(Integer.parseInt(args[1]));
            while (true) {
                executorService.execute(new ClientThread(serverSocket.accept()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Implement input parameter processing
        
        // Implementation of the main server loop
        // ServerSocket serverSocket;
    }
}
