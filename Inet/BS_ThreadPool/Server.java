package Inet.BS_ThreadPool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(5460);

        //创建线程池
        ThreadPoolExecutor pool =new ThreadPoolExecutor(32*2, 32*2, 0, TimeUnit.SECONDS,
             new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        
        while (true) {
            Socket socket=serverSocket.accept();

            System.out.println(socket.getRemoteSocketAddress()+"上线了");

            pool.execute(new ServerReaderRunnable(socket));
            

            
        }

    }
    
}
