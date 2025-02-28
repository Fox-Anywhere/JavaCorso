public class operatoriLogici {
    public static void main(String[] args) {
        boolean a = 3 < 10 && 3 % 2 == 0;  // AND
        boolean b = 3 > 10 || 20 % 2 == 0; // OR

        System.out.println(a); // Stampa false perché 3 % 2 == 1 (3 non è pari)
        System.out.println(b); // Stampa true perché 16 % 2 == 0 (16 è pari)
        System.out.println(!a); // NOT di false → true
    }
}
