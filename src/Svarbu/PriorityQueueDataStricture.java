package Svarbu;

import java.util.*;

public class PriorityQueueDataStricture {
    public static void main(String[] args) {
        // Priority Queue = FIFO data strictire. First-In First-Out

        // Naudojame PriorityQueue klase kuri surikiuoja elementus pagal eile ( Svarba )
        // Siuo atveju naudojame double
        Queue<Double> eile = new PriorityQueue<>(Collections.reverseOrder()); // Galima naudoti Collections funkcijas

        eile.offer(2.2);
        eile.offer(1.5);
        eile.offer(4.2);
        eile.offer(9.5);
        eile.offer(3.1);
        eile.offer(6.2);
        eile.offer(1.1);

        while (!eile.isEmpty()){
            System.out.print(eile.poll()+", ");
        }
    }
}
