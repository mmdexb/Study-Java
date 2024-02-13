package Inet.TCP4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread {
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run(){
        InputStream is;
        try {
            is = socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);

            while(true){
                try {
                    String str=dis.readUTF();
                    System.out.println(str);
                } catch (Exception ex) {
                    System.out.println(socket.getRemoteSocketAddress()+"下线了");
                    dis.close();
                    socket.close();
                    break;
                    
                }

            }


        } catch (IOException e) {
            
            e.printStackTrace();
        }
        

    }

    
}
