package Svarbu;
import java.util.Stack;
public class StackDataStructure {
    public static void main(String[] args) {
        // Stack -  LIFO data structure = Last-In First-Out
        //          Saugo objektus kaip kruva "Zetonus"
        //          *.push(); Prideda i virsu
        //          *.pop();  Pasalina is apacios

        Stack<String> stack = new Stack<String>();

        System.out.println("Ar sarasas tuscias ? "+stack.empty()); // Patikrina ar sarasas yra tuscias ( Grazina true arba false *boolean* )

        stack.push("Minecraft"); // Pats paskutinis elementas
        stack.push("WoW");
        stack.push("League of Legends");
        stack.push("Counter-Strike");
        stack.push("Runescape"); // Pats virsutinis elementas

        //System.out.println("Pridejus i sarasa elementu vel patikriname. Ar sarasas tuscias ? "+stack.empty());
        //System.out.println(stack);

        //stack.pop(); // Istrina is saraso paty pirma elementa
        //System.out.println(stack.peek()); // peek tai paima pati pirma elementa is saraso bet jo neistrina
        //String manoMegstamiausiasZaidimas = stack.pop(); // .pop metoda panaudojus galima istrinti ir kartu priskirti kintamui.

        //System.out.println("Sarasas po .pop(); panaudojimo, istrintas is saraso elementas yra "+manoMegstamiausiasZaidimas);
        System.out.println(stack);

        // Paieska tam tikru objektu

        System.out.println("WoW zaidimo id yra "+stack.search("WoW")); // Surandame objekta pagal pavadinima ir mums grazina jo pozicija sarase *** Jei tokio elemento nera grazina -1

    }
}
