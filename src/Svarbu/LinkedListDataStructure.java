package Svarbu;

import java.util.LinkedList;

public class LinkedListDataStructure {
    public static void main(String[] args) {
        // LikedList = Saugoja *Mazgus (Nodes) kurie susideda: DATA + ADDRESS
        // Nodes atmintyje isidelioja ne is eiles

        //                      Single linkedList
        //      Mazgas              Mazgas              Mazgas
        //  [data | address] -> [data | address] -> [data | address]
        //                      Double LikedList
        //            Mazgas                         Mazgas
        //  [address | data | address] <-> [address | data | address]


        LinkedList<String> sarasas = new LinkedList<>();

        // LikedList galima naudoti kaip Stack ir naudoti jo funkcijas
//        sarasas.push("A");
//        sarasas.push("B");
//        sarasas.push("C");
//        sarasas.push("D");
//        sarasas.pop();

        // Galima naudoti kaip Queue
        sarasas.offer("A");
        sarasas.offer("B");
        sarasas.offer("C");
        sarasas.offer("D");
//        sarasas.poll();

        // LinkedList privalumas elementu pridejimas ir isiemimas
        sarasas.add(4,"E"); // pridedame elementa i paskirta index vieta
        sarasas.remove("E"); // Istriname elementa

        System.out.println("B raide turi indexa "+sarasas.indexOf("B")); // Surandame elemento indexa
        System.out.println("Pirmas elementas sarase "+sarasas.peekFirst()+" .Paskutinis elementas sarase "+sarasas.peekLast());
        sarasas.addFirst("0"); // Pridedame elementa i saraso prieki
        sarasas.addLast("Z");  // Pridedame elementa i saraso gala

        System.out.println(sarasas);
    }
}
