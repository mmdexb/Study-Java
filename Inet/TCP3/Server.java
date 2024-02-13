package Inet.TCP3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //创建serverSocket对象
        ServerSocket serverSocket=new ServerSocket(8888);

        while (true) {
            Socket socket =serverSocket.accept();

            //把客户端对应的socket通信管道交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
            
        }

        
        
   


        
    }
    
}
