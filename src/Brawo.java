import java.util.Scanner;

public class Brawo {
    public static void main(String[] args) {
        //  Druga:
        //  Aplikacja “Brawo”
        //  Wypisz 5 razy na ekranie ”Brawo <Twoje imię>”
        // dowolna pętla
        //***zrób zmienną name aby użytkownik mógł sam wpisać swoje imię***

        String name = "Agnieszka";
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię:");
        name = sc.nextLine();
        for(int a = 1; a < 6; a++) {
            System.out.println("Brawo "+name);
        }
    }
}
