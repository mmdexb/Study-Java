package Inet;

import java.io.IOException;
import java.net.InetAddress;

public class IP {
    public static void main(String[] args) throws Exception {
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1);

        InetAddress ip2=InetAddress.getByName("www.linuschen.ink");
        System.out.println(ip2);

        System.out.println(ip2.isReachable(50));
    }
    
}
