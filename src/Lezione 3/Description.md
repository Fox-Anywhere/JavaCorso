# 📚 Lezione 3: Input Utente in Java con Scanner

In questa lezione vedremo come **leggere input dall'utente** in Java utilizzando la classe `Scanner`.

---

## 🔥 Obiettivi della Lezione

- Comprendere il funzionamento della classe `Scanner`.
- Leggere input di diversi tipi (`String`, `int`).
- Gestire problemi comuni con `Scanner`.
- Concatenare stringhe per creare un messaggio personalizzato.

---

## 🖥️ Introduzione alla classe Scanner

La classe `Scanner` permette di leggere input da varie fonti, incluso l'input da tastiera.
Per usarla, dobbiamo importarla all'inizio del programma:

```java
import java.util.Scanner;
```

Poi possiamo creare un oggetto `Scanner` che leggerà l'input da `System.in` (la tastiera).

```java
Scanner scanner = new Scanner(System.in);
```

---

## 💻 Codice di esempio

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual è il tuo nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Qual è la tua età?");
        int eta = scanner.nextInt();
        scanner.nextLine(); // Risolve il problema dell'input bloccato

        System.out.println("In che città vivi?");
        String citta = scanner.nextLine();

        System.out.println("Ciao " + nome + ", dalle informazioni che mi hai fornito, tu ti chiami " + nome + " " + cognome + ".\nHai " + eta + " anni e abiti a " + citta);
    }
}
```

---

## 🔍 Spiegazione del Codice

1. **Creazione dello Scanner**:
   ```java
   Scanner scanner = new Scanner(System.in);
   ```
   - Permette di acquisire input dalla tastiera.

2. **Lettura di stringhe**:
   ```java
   String nome = scanner.nextLine();
   ```
   - `nextLine()` legge un'intera riga di testo.

3. **Lettura di un numero intero**:
   ```java
   int eta = scanner.nextInt();
   ```
   - `nextInt()` legge un numero intero.
   - **Problema**: Dopo `nextInt()`, rimane un carattere di nuova riga ( ) nel buffer. Questo avviene perché `nextInt()` legge solo il numero, lasciando ( ) che può essere interpretato come input dalla successiva `nextLine()`, impedendone il corretto funzionamento.
   - **Soluzione**: Usiamo `scanner.nextLine();` subito dopo per consumare l'input rimanente.

4. **Output formattato**:
   ```java
   System.out.println("Ciao " + nome + " ...");
   ```
   - Costruiamo una frase concatenando variabili e testo.

---

## 📌 Concetti Chiave

- La classe `Scanner` è utilizzata per acquisire input dall'utente.
- `nextLine()` legge un'intera riga, mentre `nextInt()` legge solo un numero intero.
- Dopo `nextInt()`, è consigliato usare `scanner.nextLine();` per evitare problemi con l'input successivo.
- Possiamo concatenare stringhe per costruire messaggi personalizzati.

---

Buona programmazione! 👨‍💻✨