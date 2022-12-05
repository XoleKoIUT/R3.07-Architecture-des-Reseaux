import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GerantDeClient implements Runnable
{
    public GerantDeClient(Socket s)
    {
        try{
            Socket toServer = new Socket("c-di-712-18", 6000);
            PrintWriter out = new PrintWriter(toServer.getOutputStream(), true);
            BufferedReader in = new BufferedReader( new InputStreamReader(toServer.getInputStream()));
        }catch(IOException ie) {System.out.println("hello");}
    }

    public void run() 
    { // "main" de la thread
        while(true) { // boucle sans fin
            System.out.println("Bienvenue sur le serveur de Nicolas" );
        try{ Thread.sleep(100000); } // attend 1000ms
        catch(InterruptedException ie) {}
        }
    }
}