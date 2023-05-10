import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        final int ciastkazboxa = 40;
        final int porcjazboxa = 10;
        final int caloriezboxa = 300;

        Scanner input = new Scanner(System.in);
        System.out.print("Ile ciastek zjadłeś/aś? ");
        int zjadles = input.nextInt();

        double consum = (double)zjadles / ciastkazboxa * porcjazboxa;
        int kcalkonsum = (int)consum * caloriezboxa;

        System.out.println("Zjadłeś/aś " + kcalkonsum + " kalorii.");
    }
}
