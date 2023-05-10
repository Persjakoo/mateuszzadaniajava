import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę swojego ulubionego miasta: ");
        String miasto = scanner.nextLine();

        int liczbaZnakow = miasto.length();
        String miastoWielkimi = miasto.toUpperCase();
        String miastoMalymi = miasto.toLowerCase();
        char pierwszyZnak = miasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + miastoWielkimi);
        System.out.println("Nazwa miasta zapisana małymi literami: " + miastoMalymi);
        System.out.println("Pierwszy znak nazwy miasta: " + pierwszyZnak);
    }
}
