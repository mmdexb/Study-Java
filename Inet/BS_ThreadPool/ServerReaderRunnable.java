package Inet.BS_ThreadPool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;


public class ServerReaderRunnable implements Runnable {
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run(){
        //响应网页

        try {
            OutputStream os=socket.getOutputStream();
            PrintStream ps= new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("你好 我是linuschen");
            socket.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        

    }
    
}
