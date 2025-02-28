# 📚 Lezione 1: Basi della Programmazione in Java

Benvenuto alla prima lezione sulla programmazione in **Java**! In questo esempio, esploreremo i concetti fondamentali per scrivere un semplice programma Java: come mostrare output sulla console, dichiarare variabili e capire la struttura di base di un programma.

---

## 🔥 Obiettivi della Lezione

- Scrivere un programma Java di base.
- Comprendere la struttura di una classe Java.
- Stampare testo sulla console.
- Usare commenti per spiegare il codice.
- Dichiarare e inizializzare variabili di diversi tipi.

---

## 💻 Codice di esempio

```java
public class Main {

    public static void main(String[] args) {
        // Come mandare in output del testo
        System.out.print("Ciao mondo!");

        // Come mandare del testo in output e a capo
        System.out.println("\nPrima e dopo questo c'è un accapo grazie ad un carattere speciale \n");
        System.out.println("Oggi è una brutta giornata perchè sto scrivendo in Java e voglio farmi male!");

        /*
         * Esempio di dichiarazione di variabili:
         * Le variabili vanno prima dichiarate, poi assegnate e infine inizializzate.
         * Esempi:
         * int x; // Dichiarazione
         * x = 10; // Assegnazione
         */

        /*
         * Variabili:
         */

        // Numeri interi
        int numeroIntero = 10;

        // Numeri decimali
        double numeroConLaVirgola = 20.10;

        // Testo (stringhe)
        String testo = "Questa è una stringa";

        // Output delle variabili
        System.out.println(testo);
        System.out.println(numeroConLaVirgola);
        System.out.println(numeroIntero);
    }
}
```

---

## 🔍 Spiegazione del Codice

### 📦 1. **`public class Main`**

In Java, **tutto il codice deve essere contenuto all'interno di una classe**. Una classe rappresenta un modello o una struttura che definisce oggetti o comportamenti.

- **`public`**: Significa che la classe è accessibile da qualsiasi altra classe o file nel progetto.
- **`class`**: Parola chiave usata per definire una classe.
- **`Main`**: Nome della classe. Deve corrispondere al nome del file (in questo caso, `Main.java`).

> 🔑 **Nota:** Il file Java deve avere lo stesso nome della classe pubblica che contiene.

---

### 🚀 2. **`public static void main(String[] args)`**

Questo è il **punto di ingresso** del programma Java: il metodo da cui parte l’esecuzione del codice. Vediamo cosa significa ciascuna parola chiave:

- **`public`**: Il metodo è accessibile da qualsiasi altra classe. È necessario per permettere alla JVM (Java Virtual Machine) di eseguire il metodo.
- **`static`**: Significa che il metodo appartiene alla classe stessa e non a un'istanza della classe. La JVM può chiamarlo senza creare un oggetto della classe `Main`.
- **`void`**: Indica che il metodo non restituisce nessun valore.
- **`main`**: Nome del metodo principale, riconosciuto automaticamente dalla JVM per avviare il programma.
- **`String[] args`**: Un array di stringhe che può ricevere argomenti dalla riga di comando. Per esempio:
  - Se esegui `java Main Ciao Mondo`, il contenuto di `args` sarà `["Ciao", "Mondo"]`.

> 🔑 **Nota:** Senza il metodo `main`, il programma non si avvierà perché la JVM non saprebbe da dove iniziare.

---

### 🖥️ 3. **Output su Console**

- `System.out.print("Ciao mondo!");`: Stampa il testo senza andare a capo.
- `System.out.println()`: Stampa il testo e aggiunge un a capo alla fine.
- `\n`: Aggiunge un a capo manualmente nella stringa.

---

### 📝 4. **Dichiarazione e Inizializzazione di Variabili**

- **`int`**: Per numeri interi (es. 10, -5).
- **`double`**: Per numeri con la virgola decimale (es. 20.10).
- **`String`**: Per memorizzare sequenze di caratteri (es. `"Ciao mondo"`).

Esempio:

```java
int numero = 5; // Dichiarazione e inizializzazione
```

---

### 💬 5. **Commenti**

- `//`: Commento su una singola riga.
- `/* ... */`: Commento su più righe.

I commenti non vengono eseguiti dal programma, ma aiutano a migliorare la leggibilità del codice.

---

## ⚙️ Come Eseguire il Codice

1. **Compilare il programma:**  
   Assicurati di avere Java installato. Compila il file da terminale con:

   ```bash
   javac Main.java
   ```

2. **Eseguire il programma:**  
   Avvia il programma usando:

   ```bash
   java Main
   ```

3. **Output previsto:**

   ```bash
   Ciao mondo!

   Prima e dopo questo c'è un accapo grazie ad un carattere speciale 

   Oggi è una brutta giornata perchè sto scrivendo in Java e voglio farmi male!
   Questa è una stringa
   20.1
   10
   ```

---

## 📌 Concetti Chiave

- Ogni programma Java deve contenere almeno una **classe pubblica** e un **metodo `main`**.
- Le variabili devono essere dichiarate con un tipo di dato specifico.
- I commenti migliorano la leggibilità ma non influenzano l’esecuzione del codice.

---

Buona programmazione! 👨‍💻✨