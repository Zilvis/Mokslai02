package namuDarbai;
import java.util.Scanner;
public class namuDarbai04 {
    public static void main(String[] args) {
        System.out.println("Namu Darbai 04");

            Scanner skaneris = new Scanner(System.in);

            System.out.println("NamuDarbai03 \n");
            System.out.println("Nurodykite kiek skaičių norite įvesti:");
            int skaiciai = skaneris.nextInt();

            for (int i = 0; i < skaiciai; i++) {
                System.out.print("Įveskite skaičių: ");
                int suvestiSkaiciai = skaneris.nextInt();
                System.out.println(suvestiSkaiciai);
            }
    }
}
