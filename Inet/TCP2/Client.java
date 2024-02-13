package Inet.TCP2;

import java.io.DataOutputStream;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        //创建socket对象 请求与服务端程序链接
        Socket socket=new Socket("127.0.0.1",8888);

        //从socket通信管道中得到一个字节输出流 用来发数据给服务端程序
        OutputStream os=socket.getOutputStream();

        //把低级的字节输出流包装为数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        while (true) {
            System.out.println("请说");
            String msg =sc.nextLine();

            if (msg.equals("exit")) {

                break;
            }
            
            dos.writeUTF(msg);
            dos.flush();
            
        }

        dos.close();
        socket.close();
    }
    
}
