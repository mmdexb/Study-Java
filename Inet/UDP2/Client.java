package Inet.UDP2;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建客户端
        DatagramSocket socket =new DatagramSocket();
        Scanner sc =new Scanner(System.in);

        //创建数据包对象 封装要发出去的数据
        while (true) {
            System.out.println("请说:");
            String msg=sc.nextLine();

            if(msg.equals("exit")){
                break;
            }
            byte[] bytes =msg.getBytes();


            DatagramPacket packet =new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),6666);
    
            //发送数据包出去
            socket.send(packet);
            
            
        }
        System.out.println("已退出");
        sc.close();
        socket.close();
        
    }
    
    
}
