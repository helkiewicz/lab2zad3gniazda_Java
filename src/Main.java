import java.io.IOException;
import java.net.*;
import java.util.*;

public class Main
{
    public static void main(String args[]) {
        Socket socket = null;

        ArrayList<String> port = new ArrayList<String>();
        port.add("www.wp.pl");
        port.add("www.ug.edu.pl");
        port.add("www.onet.pl");
        port.add("www.interia.pl");
        port.add("www.helion.pl");

        Collections.shuffle(port);

        for (String host : port) {
            try {
                socket = new Socket(host, 80);
            } catch (UnknownHostException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
            if (socket != null) {
                System.out.println(socket);
            }
        }

        Scanner myObj = new Scanner(System.in);
        String hostName = myObj.nextLine();

        InetAddress[] inetAddress = null;
        try {
            inetAddress = InetAddress.getAllByName(hostName);

            for (InetAddress address : inetAddress) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            System.out.println(
                    "Nie można uzyskać adresu IP dla hosta " + hostName);
            System.exit(0);
        }
    }
}