package Svarbu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class LinearSearch {
    public static void main(String[] args) {

        // LinearSearch tai paieska sarase skirta mazos / vidutines apimties duomenims ieskoti

        int[] sarasas = {1,2,3,4,5,67,2,3,1,5,76};
        int index = linearSearch(sarasas, 10);

        if (index != -1){
            System.out.println("elemento indeksas yra " +index);
        } else {
            System.out.println("Elementas nerastas! ");
        }
    }

    static int linearSearch(int[] sarasas, int elementas) {
        for (int i = 0; i < sarasas.length; i ++){
            if (sarasas[i] == elementas){
                return i;
            }
        }
        return -1;
    }
}
