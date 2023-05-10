public class zadanie6 {
    public static void main(String[] args) {
        int pokoj1szerokosc = 3;
        int pokoj1dlugosc = 4;
        int pokoj2szerokosc = 3;
        int pokoj2dlugosc = 4;
        int pokoj3szerokosc = 2;
        int pokoj3dlugosc = 3;
        int pokoj4szerokosc = 2;
        int pokoj4dlugosc = 2;

        int pokoj1obj = pokoj1szerokosc * pokoj1dlugosc;
        int pokoj2obj = pokoj2szerokosc * pokoj2dlugosc;
        int pokoj3obj = pokoj3szerokosc * pokoj3dlugosc;
        int pokoj4obj = pokoj4szerokosc * pokoj4dlugosc;

        int calaobj = pokoj1obj + pokoj2obj + pokoj3obj + pokoj4obj;
        int objdlajednejosoby = calaobj / 4;

        System.out.print("Powierzchnia pokoju 1: " + pokoj1obj + " m^2");
        System.out.print("Powierzchnia pokoju 2: " + pokoj2obj + " m^2");
        System.out.print("Powierzchnia pokoju 3: " + pokoj3obj + " m^2");
        System.out.print("Powierzchnia pokoju 4: " + pokoj4obj + " m^2");
        System.out.print("Powierzchnia calkowita: " + calaobj + " m^2");
        System.out.print("Powierzchnia dla jednej osoby: " + objdlajednejosoby + " m^2");

    }
}