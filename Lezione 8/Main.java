public class Main {
    public static void main(String[] args) {
        /*
         * INIZIO: IF utilizzato con le stringhe e variabili
         */
        boolean isOnline = true;
        String nome1 = "Luca";
        String nome2 = "Marco";
        String nome = "Giovanni";

        if (nome == nome2) {
            if (isOnline) {
                System.out.println(nome + " è online");
            } else {
                System.out.println(nome + " è offline");
            }
        } else if (nome == nome1) {
            if (isOnline) {
                System.out.println(nome + " è online");
            } else {
                System.out.println(nome + " è offline");
            }
        } else {
            System.out.println("Sia Luca che Marco risultano Offline, ma " + nome + " risulta online");
        }

        /*
         * FINE
         */

        /*
         * INIZIO: IF utilizzando i numeri interi
         */

        int numero = 20;

        if (numero < 10) {
            System.out.println("è minore di 10");
            if (numero % 2 == 0) {
                System.out.println("è pari");
            } else {
                System.out.println("è dispari");
            }
        } else {
            System.out.println("è maggiore di 10");
        }

        /*
         * FINE
         */

        /*
         * INIZIO: ternary operator
         */

        int numero1 = 11;

        String x = numero1 < 10 ? +numero1 + " è minore di 10" : +numero1 + " è maggiore di 10";

        System.out.println(x);
    }
}
