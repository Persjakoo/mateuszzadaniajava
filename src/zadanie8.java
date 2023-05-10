import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szerokość pokoju nr 1: ");
        double room1Width = scanner.nextDouble();
        System.out.print("Podaj długość pokoju nr 1: ");
        double room1Length = scanner.nextDouble();

        System.out.print("Podaj szerokość pokoju nr 2: ");
        double room2Width = scanner.nextDouble();
        System.out.print("Podaj długość pokoju nr 2: ");
        double room2Length = scanner.nextDouble();

        System.out.print("Podaj szerokość pokoju nr 3: ");
        double room3Width = scanner.nextDouble();
        System.out.print("Podaj długość pokoju nr 3: ");
        double room3Length = scanner.nextDouble();

        System.out.print("Podaj szerokość pokoju nr 4: ");
        double room4Width = scanner.nextDouble();
        System.out.print("Podaj długość pokoju nr 4: ");
        double room4Length = scanner.nextDouble();


        double room1Area = room1Width * room1Length;
        double room2Area = room2Width * room2Length;
        double room3Area = room3Width * room3Length;
        double room4Area = room4Width * room4Length;


        double totalArea = room1Area + room2Area + room3Area + room4Area;


        double areaPerPerson = totalArea / 4;


        System.out.println("Powierzchnia pokoju nr 1: " + room1Area + " m^2");
        System.out.println("Powierzchnia pokoju nr 2: " + room2Area + " m^2");
    }
}