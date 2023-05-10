import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj cenę posiłku: ");
        double cena = input.nextDouble();

        double podatek = cena * 0.0675;
        double napiwek = (cena + podatek) * 0.20;
        double lacznaKwota = cena + podatek + napiwek;

        System.out.println("Cena posiłku: " + cena);
        System.out.println("Podatek: " + podatek);
        System.out.println("Napiwek: " + napiwek);
        System.out.println("Łączna kwota do zapłaty: " + lacznaKwota);
    }
}
