public class Array2D {
    public static void main(String[] args) {
        String[][] classi = new String[3][3];

        /*
         * Primo metodo:
         */

        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        classi[1][0] = "Giovanni";
        classi[1][1] = "Federico";
        classi[1][2] = "Patrizia";

        classi[2][0] = "Gian Maria";
        classi[2][1] = "Stefano";
        classi[2][2] = "Edoardo";

        /*                0               1               2
         * classe 0 -> |Luca         |Anna          |Marco      |
         * classe 1 -> |Giovanni     |Federico      |Patrizia   |
         * classe 2 -> |Gian Maria   |Stefano       |Edoardo    |
        */
        
        /*
         * Secondo metodo:
        */

        String[][] paesi = {
            {"Italia", "Roma" , "Milano"},
            {"Francia", "Parigi", "Lione"},
            {"Spanga", "Madrid", "Barcellona"}
        };

        System.out.println("\nQuesti sono i paesi  con le loro città: ");
        for (int paese = 0; paese < paesi.length; paese++) {
            System.out.println();
            for (int citta = 0; citta < paesi[paese].length; citta++) {
                System.out.print(paesi[paese][citta] + " ");
            }
        }




        System.out.println("\n\nQuesti sono gli stuedenti delle classi:");
        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for(int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + " ");
            }
        }


        System.out.println("\n\nQui invece sto mandando l'output con FOREACH: ");
        for (String[] paese : paesi) {
            System.out.println();
            for(String citta : paese) {
                System.out.print(citta + " ");
            }
            
        }

    }
}
