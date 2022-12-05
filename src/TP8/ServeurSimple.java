import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServeurSimple
{
    public ServeurSimple() throws IOException
    {
        try{
            ServerSocket ss = new ServerSocket(6000);
            while (true) {
                Socket s = ss.accept();
                GerantDeClient gdc = new GerantDeClient(s);
                Thread tgdc = new Thread(gdc);
                tgdc.start();
            }
        }catch(UnknownHostException e) {e.printStackTrace();}
    }
}