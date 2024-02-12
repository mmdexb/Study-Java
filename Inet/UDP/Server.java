package Inet.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        //创建服务端对象
        DatagramSocket socket=new DatagramSocket(6666);

        //创建一个数据包对象 用于接收数据
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length);

        //用数据包接受客户端发来的数据
        socket.receive(packet);

        int len =packet.getLength();
        String rs=new String(buffer,0,len);
        System.out.println(packet.getAddress()+"==="+packet.getPort());
        System.out.println(rs);

        socket.close();



    }
}
