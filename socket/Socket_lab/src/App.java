import java.net.*;

public class App {
    public static void main(String[] args) throws Exception {
        InetAddress ad=InetAddress.getLocalHost();
        System.out.println(ad);
        System.out.println(ad.getHostName());
        System.out.println(ad.getHostAddress());
        System.out.println(ad.getCanonicalHostName());
    }
}
