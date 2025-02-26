public class Main {
    public static void main(String[] args) {
        int primoDato = 10;
        int secondoDato = 2;
        int risultatoAddizione = primoDato + secondoDato;
        int risultatoSottrazione = primoDato - secondoDato;
        int risultatoDivisione = primoDato / secondoDato;
        int risultatoMoltiplicazione = primoDato * secondoDato;
        int risultatoModulo = primoDato % secondoDato;

        System.out.println("I dati sono i seguenti: \nPrimo dato: " +primoDato + "\nSecondo dato: " +secondoDato + "\nQuesto è il risultato dell'addizione: " +risultatoAddizione + "\nQuesto è il risultato della sottrazione: " +risultatoSottrazione + "\nQuesto è il risultato della moltiplicazione: " + risultatoMoltiplicazione + "\nQuesto è il risultato della divisione: " +risultatoDivisione + "\nQuesto è il modulo (cioè il resto della divisione): " +risultatoModulo);

        int a = 0;
        a += 3; //per effettuare una somma a se stesso o qualsiasi altra operazione, si può mettere direttmanete il segno prima dell'uguale e questo verrà espresso come "a = a +3"
        
        a++; //possiamo incrementare la stessa variabile di 1 utilizzando "++" o "--"
        System.out.println(a);

        int risultato = ((primoDato + secondoDato) * primoDato + (4 - 2)) * a;
        System.out.println(risultato);
    }
}
