public class Liczydło {
    public static void main(String[] args) {
        // Trzecia***:
        // Aplikacja “Liczydło”
        // wprowadź taką tablice int’ów : {2, 3, 7, 3, 3, 5, 2}
        // dodaj logikę która zliczy ‘3’ z tablicy
        // ilość zliczonych ‘3’ będzie wypisana na ekranie

        int liczba_3 = 0;
        int[] tablica = {2, 3, 7, 3, 3, 5, 2};

        for(int a = 0; a < 7; a++){
            if(tablica[a] == 3){
                liczba_3++;
            }

        }
        System.out.println(liczba_3);

    }
}
