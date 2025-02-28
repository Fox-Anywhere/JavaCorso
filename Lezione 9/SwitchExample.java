import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esempio 1: Switch su numeri interi (menu di selezione)
        System.out.println("Scegli un'opzione: \n1) Start \n2) Settings \n3) Exit\n");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Avvio in corso...");
                break;
            case 2:
                System.out.println("Apertura impostazioni...");
                break;
            case 3:
                System.out.println("Uscita dal programma...");
                break;
            default:
                System.out.println("Opzione non valida.");
        }

        // Esempio 2: Switch su stringhe (determinazione del giorno lavorativo)
        System.out.println("Inserisci un giorno della settimana:");

        /*
         * Usiamo scanner.next() invece di scanner.nextLine() perché prima abbiamo usato nextInt(),
         * e se usassimo nextLine() subito dopo, leggeremmo solo il '\n' rimasto nel buffer.
         * Con next() prendiamo solo la prima parola inserita dall'utente e poi la convertiamo in minuscolo.
         */

        String giorno = scanner.next().toLowerCase();

        switch (giorno) {
            case "sabato":
            case "domenica":
                System.out.println("È un giorno di riposo!");
                break;
            case "lunedi":
            case "martedi":
            case "mercoledi":
            case "giovedi":
            case "venerdi":
                System.out.println("È un giorno lavorativo.");
                break;
            default:
                System.out.println("Giorno non riconosciuto.");
        }

        // Esempio 3: Switch con espressioni lambda (Java 14+)
        System.out.println("Inserisci un numero (1-3) per ottenere un messaggio:");
        int numero = scanner.nextInt();
        
        String messaggio = switch (numero) {
            case 1 -> "Hai scelto uno!";
            case 2 -> "Hai scelto due!";
            case 3 -> "Hai scelto tre!";
            default -> "Numero non valido!";
        };

        System.out.println(messaggio);

        scanner.close();
    }
}
