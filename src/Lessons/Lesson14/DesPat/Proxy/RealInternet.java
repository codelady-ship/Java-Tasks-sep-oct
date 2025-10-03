package Lessons.Lesson14.DesPat.Proxy;
// (əsl obyekt)
public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("İnternetə qoşuldu: " + serverHost);
    }
}

