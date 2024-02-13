package Inet.TCP4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
        
    }
    @Override 
    public void run(){
        try {
            InputStream is=socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);

            while(true){
                try{  
                    System.out.println(socket.getRemoteSocketAddress());
                    String str=dis.readUTF();
                    System.out.println(str);

                    //把消息发送给全部客户端
                    sendMsgToAll(str);


                }catch(Exception a){
                    System.out.println(socket.getRemoteSocketAddress()+"下线了");
                    Server.sockets.remove(socket);
                    dis.close();;
                    socket.close();
                    break;

                }
            }
        } catch (Exception e) {
                
                e.printStackTrace();
        }
        
    }
    private void sendMsgToAll(String str) throws IOException {
       for (Socket sockets : Server.sockets) {
            OutputStream os= sockets.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            dos.writeUTF(str);
            dos.flush();
       }
    }
}
