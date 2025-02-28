/*
 * Tipi di dati: Primitive & Reference
 * 
 * -boolean | true:false                                        | 1bit
 * -byte    | -128 :127                                         | 2 bytes
 * -short   | -32768 : 32767                                    | 2 bytes
 * -int     | -2 miliardi : 2 miliardi                          | 4 bytes
 * -long    | -9 quintilioni : 9 quintilioni                    | 8 bytes
 * 
 * -float   | numero con 6-7 cifre decimali 5.123526f           | 4 bytes
 * -double  | numero con 15 cifre decimali 5.123526236701522    | 8 bytes
 * 
 * -chat    | singolo carattere/lettera ASCII `f`               | 2 bytes
 * -String  | sequenza di caratteri "Ciao mondo!"               | variabile
 * 
 * -Diffrenze tra Primitive & Reference ( iniziale e attributi disponibili )
 */


public class Main {

    public static void main(String[] args) {
        /* Primitive */
        boolean ilBoolean = true;
        byte ilByte = 126;
        short loShort = -32766;
        int lIntero = 2_000_000_000; //si possono utilizzare "_" per vedere meglio il numero, in output non verrà visualizzato
        long ilLong = 9_223_372_036_854_775_807L; //mettere una L/l finale, sennò da errore
        
        float ilFloat = 6.345623f; //mettere una F/f finale, sennò da errore
        double ilDouble = 5.123526236701522;
        
        char ilChar = 'd';
        /* Fine Primitive */

        /* Reference */
        String laStringa = "Questa è una stringa";
        /* Fine Feference */

        //laStringa.toUpperCase()

        System.out.println(laStringa.toUpperCase()); //viene utilizzata una stringa con una funzione, come in questo caso l'uppercase, che rende il testo tutto maiuscolo

    }
}
