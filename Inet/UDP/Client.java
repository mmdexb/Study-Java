package Inet.UDP;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建客户端
        DatagramSocket socket =new DatagramSocket(1367);

        //创建数据包对象 封装要发出去的数据
        byte[] bytes ="我是一个客户端".getBytes();
        DatagramPacket packet =new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),6666);

        //发送数据包出去
        socket.send(packet);

        socket.close();
        System.out.println("客户端数据发送完毕");



        
    }
    
    
}
