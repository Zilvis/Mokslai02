package Svarbu;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {
    public static void main(String[] args) {
        // *** Queue naudoja Collections.
        // Queue =  FIFO Data structure. First-In First-Out (Kaip linija zmoniu)
        //          Kaip gyva zmoniu eiele prie kasos parduotuveje. *** Pirmas atejas pirmas aptarnaujamas.
        //          Linijine duomenu strtuktura
        //          prideda     = offer();   Pridedamas objektas i sarasa is galo ( Eiles galo )
        //          pasalina    = poll();    Pasalinimas objektas is saraso is pradzios ( Eiles priekio )
        //          peek();              Patikrina pirma reiksme ir grazina ja grazina ( pirma objekta eileje )

        Queue<String> eile = new LinkedList<String>(); // Naudojame LinkedList nes Queue yra interface

        eile.offer("Tomas");
        eile.offer("Gabrielius");
        eile.offer("Viktoras");

        System.out.println(eile);
        System.out.println("Ar sarasas yra tuscias "+eile.isEmpty()+" ir kokiek jame elementu: "+ eile.size());
        System.out.println("Ar Tomas yra mususu sarase ? "+eile.contains("Tomas"));

        eile.poll(); // Istrina pirma elementa eileje
        eile.poll();

        System.out.println(eile); // Atspauzdiname sarasa
        System.out.println(eile.peek()); // Patikrina pirma elementa eieleje
    }
}
