public class ForLoopExamples {
    public static void main(String[] args) {
        // 1️⃣ Esempio di ciclo FOR base
        System.out.println("Esempio di ciclo FOR base:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterazione: " + i);
        }

        // 2️⃣ Esempio di ciclo FOR annidato (stampa tabella 3x3)
        System.out.println("\nEsempio di ciclo FOR annidato:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); // A capo dopo ogni riga
        }

        // 3️⃣ Esempio di ciclo FOR-EACH (enhanced for loop)
        System.out.println("\nEsempio di ciclo FOR-EACH:");
        int[] numeri = {10, 20, 30, 40, 50};
        for (int num : numeri) {
            System.out.println("Numero: " + num);
        }

        // 4️⃣ Esempio di uso di BREAK (interrompe il loop)
        System.out.println("\nEsempio con BREAK:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Interruzione del ciclo con BREAK!");
                break; // Ferma il ciclo quando i è 5
            }
            System.out.println("Iterazione: " + i);
        }

        // 5️⃣ Esempio di uso di CONTINUE (salta un'iterazione)
        System.out.println("\nEsempio con CONTINUE:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Salto l'iterazione " + i + " con CONTINUE!");
                continue; // Salta solo l'iterazione quando i è 3
            }
            System.out.println("Iterazione: " + i);
        }
    }
}
