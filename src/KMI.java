import java.util.Scanner;
public class KMI {
    public static void main(String[] args) {
        float KMIsvoris, KMIugis, kmi;
        Scanner skaneris = new Scanner(System.in);
        System.out.println("Kūno masės indekso skaičiuoklė ");

        System.out.print("Įveskite savo svorį: ");
        KMIsvoris = skaneris.nextFloat();

        System.out.print("Įveskite savo ūgį (PVZ 1,85): ");
        KMIugis = skaneris.nextFloat();

        kmi = KMIsvoris / (KMIugis * KMIugis);
        System.out.println("Jūsų kuno masės indeksas yra: " +kmi);

    }
}
