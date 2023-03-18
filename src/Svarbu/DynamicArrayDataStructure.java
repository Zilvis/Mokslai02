package Svarbu;

import java.util.ArrayList;

public class DynamicArrayDataStructure {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ArrayList<String> sarasas = new ArrayList<>();
        sarasas.add("Tomas");
        sarasas.add("Ugne");
        sarasas.add("Nojus");
        System.out.println(sarasas);
        System.out.println("Ar sarasas tuscias ? : "+sarasas.isEmpty());
        System.out.println("Kiek elementu yra sarase? : "+sarasas.size());
        System.out.println("Index nr 2 yra : "+sarasas.get(2));


        long endTime = System.nanoTime();
        long result = endTime - startTime;
        System.out.println("Programa uztruko \t"+result+" ns");
    }
}
