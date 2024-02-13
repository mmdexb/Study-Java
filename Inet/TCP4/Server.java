package Inet.TCP4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.*;

public class Server {
    public static List<Socket> sockets=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        //创建serverSocket对象
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true) {
            Socket socket =serverSocket.accept();
            sockets.add(socket);
            System.out.println(socket.getRemoteSocketAddress()+"上线了");

            //把客户端对应的socket通信管道交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
            
        }

        
        
   


        
    }
    
}
