package Lessons.Lesson14.DesPat.Proxy;
//sən bir evə (əsl obyekt) girə bilməzsən, qapıçı (proxy) var.
//Qapıçı yoxlayır: "icazən varmı?". Əgər varsa, səni içəri buraxır.
// Əks halda – yox.


//(client)
public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");      // icazə verilir
            internet.connectTo("facebook.com");    // qadağandır
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

