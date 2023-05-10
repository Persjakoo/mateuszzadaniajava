import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String firstName = scanner.nextLine();

        System.out.print("Podaj swoje drugie imię (jeśli nie posiadasz, naciśnij Enter): ");
        String middleName = scanner.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String lastName = scanner.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.isEmpty() ? ' ' : middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Twoje inicjały to: " + firstInitial + middleInitial + lastInitial);
    }
}
