public class ArrayExample {
    public static void main(String[] args) {
        // 1️⃣ Creare un array vuoto (di lunghezza fissa)
        int[] numeri = new int[5]; // Array di 5 elementi inizializzati a 0
        System.out.println("Array inizialmente vuoto:");
        stampaArray(numeri);                                            //Questa funzione la si può trovare alla fine, è stampa l'array tra le "[ ]" 

        // 2️⃣ Associare elementi all'array
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        numeri[3] = 40;
        numeri[4] = 50;
        System.out.println("\nArray dopo l'assegnazione di valori:");
        stampaArray(numeri);

        // 3️⃣ Stampare la lunghezza dell'array
        System.out.println("\nLunghezza dell'array: " + numeri.length);

        // 4️⃣ Modificare un elemento dell'array
        numeri[2] = 100; // Cambia il valore in posizione 2 (terzo elemento)
        System.out.println("\nArray dopo la modifica:");
        stampaArray(numeri);

        // 5️⃣ Mostrare gli elementi con un ciclo FOR classico
        System.out.println("\nMostrare gli elementi con un ciclo FOR:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Elemento " + i + ": " + numeri[i]);
        }

        // 6️⃣ Ciclare l'array con un ciclo FOR-EACH (enhanced for)
        System.out.println("\nMostrare gli elementi con un ciclo FOR-EACH:");
        for (int num : numeri) {
            System.out.println("Elemento: " + num);
        }
    }

    // Metodo per stampare un array senza usare Arrays.toString()
    public static void stampaArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); // Aggiunge una virgola tra gli elementi
            }
        }
        System.out.println(" ]");
    }
}
