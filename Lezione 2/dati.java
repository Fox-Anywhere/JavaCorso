public class dati {

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

        System.out.println(ilBoolean);
        System.out.println(ilByte);
        System.out.println(loShort);
        System.out.println(lIntero);
        System.out.println(ilLong);
        System.out.println(ilFloat);
        System.out.println(ilDouble);
        System.out.println(ilChar);

    }
}
