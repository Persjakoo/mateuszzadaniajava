import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double km = input.nextDouble();

        System.out.print("Podaj ilość zużytych litrów paliwa: ");
        double litry = input.nextDouble();

        double kmnalitr = km / litry;

        System.out.printf("Liczba kilometrów na litrze: %.2f", kmnalitr);
    }
}
