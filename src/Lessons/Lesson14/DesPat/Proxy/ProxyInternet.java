package Lessons.Lesson14.DesPat.Proxy;
//proxy – nəzarət edən
import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> blockedSites;

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("facebook.com");
        blockedSites.add("instagram.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (blockedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Giriş qadağandır: " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}

