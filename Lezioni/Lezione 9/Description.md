# 📚 Lezione 9: Switch in Java

In questa lezione esploreremo la **struttura `switch`**, una valida alternativa agli `if-else` multipli.

---

## 🔥 Obiettivi della Lezione

- Comprendere l'uso dello **switch**.
- Utilizzare **case multipli** per gestire diverse condizioni.
- Implementare **switch con stringhe e numeri**.
- Conoscere lo **switch con espressioni lambda** (Java 14+).

---

## 🖥️ Struttura di uno `switch`

La struttura `switch` permette di confrontare una variabile con diversi valori e eseguire blocchi di codice in base al valore corrispondente.

```java
switch (variabile) {
    case valore1:
        // Codice eseguito se variabile == valore1
        break;
    case valore2:
        // Codice eseguito se variabile == valore2
        break;
    default:
        // Codice eseguito se nessun valore corrisponde
}
```

---

## 💻 Codice di esempio

```java
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Switch su numeri interi
        System.out.println("Scegli un'opzione: 1) Start 2) Settings 3) Exit");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                System.out.println("Avvio in corso...");
                break;
            case 2:
                System.out.println("Apertura impostazioni...");
                break;
            case 3:
                System.out.println("Uscita dal programma...");
                break;
            default:
                System.out.println("Opzione non valida.");
        }

        // Switch su stringhe
        System.out.println("Inserisci un giorno della settimana:");
        String giorno = scanner.next().toLowerCase();

        switch (giorno) {
            case "sabato":
            case "domenica":
                System.out.println("È un giorno di riposo!");
                break;
            case "lunedi":
            case "martedi":
            case "mercoledi":
            case "giovedi":
            case "venerdi":
                System.out.println("È un giorno lavorativo.");
                break;
            default:
                System.out.println("Giorno non riconosciuto.");
        }

        // Switch con espressioni lambda (Java 14+)
        System.out.println("Inserisci un numero (1-3) per ottenere un messaggio:");
        int numero = scanner.nextInt();
        
        String messaggio = switch (numero) {
            case 1 -> "Hai scelto uno!";
            case 2 -> "Hai scelto due!";
            case 3 -> "Hai scelto tre!";
            default -> "Numero non valido!";
        };

        System.out.println(messaggio);
        scanner.close();
    }
}
```

---

## 📌 Concetti Chiave

- **Lo switch** sostituisce `if-else` multipli rendendo il codice più leggibile.
- **Può essere usato con numeri, stringhe e altri tipi di dato compatibili**.
- **Lo switch moderno con espressioni lambda** semplifica ulteriormente la sintassi (Java 14+).
- **Sempre includere `break`** per evitare l'esecuzione non voluta dei case successivi.

---

Buona programmazione! 👨‍💻✨

