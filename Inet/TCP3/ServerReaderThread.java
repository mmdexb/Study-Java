package Inet.TCP3;

import java.io.DataInputStream;
import java.io.InputStream;
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
            while (true) {
                String res=dis.readUTF();
                System.out.println(socket.getRemoteSocketAddress());
                System.out.println(res);
                
            }

        } catch (Exception e) {
            
        }
    }
}
