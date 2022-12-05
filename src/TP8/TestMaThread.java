public class TestMaThread
{
    public static void main(String[] arg) {
        // on prépare les "satellites" :
        MaThread mt1 = new MaThread("t1");
        MaThread mt2 = new MaThread("t2");
        MaThread mt3 = new MaThread("t3");
        // on installe un "satellite" par "fusée" :
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        Thread t3 = new Thread(mt3);
        // on lance les "fusées" :
        t1.start();
        t2.start();
        t3.start();
        }
}