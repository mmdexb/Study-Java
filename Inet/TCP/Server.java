package Inet.TCP;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //创建serverSocket对象
        ServerSocket serverSocket=new ServerSocket(8888);

        //使用serverSocket对象 调用accept方法 等待客户端的链接请求
        Socket socket=serverSocket.accept();

        //从socket管道中得到字节输入流
        InputStream is=socket.getInputStream();

        //包装成数据输入流
        DataInputStream dis=new DataInputStream(is);

        //使用数据输入流读取客户端消息
        System.out.println(socket.getRemoteSocketAddress());
        String str=dis.readUTF();
        System.out.println(str);

        dis.close();
        socket.close();
   


        
    }
    
}
