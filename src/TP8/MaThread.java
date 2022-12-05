package TP8;

public class MaThread implements Runnable
{
    private String nom;
    public MaThread(String nom)
    {
        this.nom = nom;
    }
    
    public void run() 
    { // "main" de la thread
        while(true) { // boucle sans fin
            System.out.println(this.nom);
        try{ Thread.sleep(1000); } // attend 1000ms
        catch(InterruptedException ie) {}
        }
    }
}