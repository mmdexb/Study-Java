package Inet.BS;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(5460);

        while (true) {
            Socket socket=serverSocket.accept();

            System.out.println(socket.getRemoteSocketAddress()+"上线了");

            new ServerReaderThread(socket).start();
            

            
        }

    }
    
}
