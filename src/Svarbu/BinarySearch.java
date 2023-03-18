package Svarbu;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary search =      Paieskos algoritmas kuris iesko reikiamo elemento surikiuotam sarase,
        //                      paieskos metu paimamas vidurinis elementas ir lyginamas su kaireje esanciu elementu
        //                      jei jis mazesnis uz ieskoma visi like elementai panaikinami kaireje
        //                      tada is likusiu elementu pasiimame vidurini elementa ir taip tikriname kol randame norima.
        // Binary search naudingas dirbant su dideliais kiekiais duomenu bet neefektyvus su mazos apimties duomenimis.

        // Yra du budai vienas BuiltIn kitas per funkcija kuria galima pasidaryti

        int sarasas[] = new int[100020341];
        int ieskomasElementas = 42;

        for (int i = 0; i < sarasas.length; i++){
            sarasas[i] = i;
        }

        // int index = Arrays.binarySearch(sarasas,ieskomasElementas); // Pirmas budas naudojant Arrays biblioteka
        int index = binarySearch(sarasas,ieskomasElementas); // Antras budas susikuriant funkcija

        if (index != -1){
            System.out.println("Ieskomas elementas " + ieskomasElementas + " yra index " +index );
        } else {
            System.out.println("Elementas nerastas!");
        }
    }

    private static int binarySearch(int[] sarasas, int ieskomasElementas) {
        int low = 0; //Low index
        int high = sarasas.length -1; // High index

        while (low <= high){
            int middle = low + (high - low) / 2; // Formule su kuria surandame vidurini index
            int value = sarasas[middle];

            System.out.println(middle);

            if (value < ieskomasElementas){
                low = middle +1;
            }else if (value > ieskomasElementas){
                high = middle -1;
            } else {
                return middle; // Ieskomas elementas rastas
            }
        }

        return -1;
    }
}
