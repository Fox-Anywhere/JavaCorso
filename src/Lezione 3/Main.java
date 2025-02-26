import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quale è il tuo nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Quale è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Quale è la tua età?");
        int eta = scanner.nextInt();
        scanner.nextLine(); //Questa stringa viene aggiunta perchè sennò "nextInt", interromperebbe il processo e non verrebbe accettato l'input per la domanda successiva

        System.out.println("In che città vivi?");
        String citta = scanner.nextLine();

        System.out.println("Ciao " + nome + ", dalle informazioni che mi hai fornito, tu ti chiami " +nome + " " +cognome + ".\nHai " +eta + " anni e abiti a " +citta);
        
    }
}
