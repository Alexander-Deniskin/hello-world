import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 * Created by deniskin.a on 17.11.2016.
 */
public class Ping {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите адрес подсети: ");
        String ip = sc.nextLine();

        try
        {
            InetAddress IPs[]=
                    InetAddress.getAllByName(ip);
            for(int i=0;i<IPs.length;++i) {
                if(IPs[i].isReachable(1000))
                    System.out.println(IPs[i]);
            }
        }
        catch(UnknownHostException ex)
        {
            System.out.println(ex.toString());
        }
    }
}
