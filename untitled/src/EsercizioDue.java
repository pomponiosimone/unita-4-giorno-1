import java.util.Scanner;

public class EsercizioDue {

    public static String conct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao, inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();

        System.out.println("Ciao, inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();

        System.out.println("Ciao, inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine();

        String risultato = primaStringa + " " + secondaStringa + " " + terzaStringa;
        scanner.close();

        return risultato;
    }

    public static void main(String[] args) {
        String concatenazione = conct();
        System.out.println(concatenazione);
    }
}