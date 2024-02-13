package Inet.TCP;

import java.io.DataOutputStream;

import java.io.OutputStream;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception {
        //创建socket对象 请求与服务端程序链接
        Socket socket=new Socket("127.0.0.1",8888);

        //从socket通信管道中得到一个字节输出流 用来发数据给服务端程序
        OutputStream os=socket.getOutputStream();

        //把低级的字节输出流包装为数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        //开始写数据出去
        dos.writeUTF("HI!");
        dos.close();
        socket.close();

    }
    
}
