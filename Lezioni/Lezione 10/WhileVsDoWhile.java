public class WhileVsDoWhile {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("Esempio con WHILE:");
        while (a < 5) { // La condizione è FALSA all'inizio
            System.out.println("Questo messaggio non verrà mai stampato!");
        }

        System.out.println("\nEsempio con DO-WHILE:");
        do {
            System.out.println("Questo messaggio viene stampato almeno una volta!");
        } while (b < 5); // La condizione è FALSA, ma il codice è già stato eseguito

        System.out.println("\nFine del programma.");
    }
}
