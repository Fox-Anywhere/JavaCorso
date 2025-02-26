# 📚 Lezione 2: Tipi di Dati in Java - Primitive & Reference

In questa lezione esploreremo i **tipi di dati** in Java, che si dividono in due categorie principali:

1. **Tipi primitivi (Primitive types)**: Rappresentano valori semplici e sono memorizzati direttamente in memoria.
2. **Tipi di riferimento (Reference types)**: Sono oggetti che non contengono direttamente il valore, ma un collegamento alla memoria in cui esso è archiviato.

---

## 🔥 Obiettivi della Lezione

- Comprendere i tipi di dati primitivi e di riferimento in Java.
- Capire le dimensioni e i limiti di ciascun tipo di dato.
- Distinguere tra variabili primitive e reference.
- Eseguire operazioni sui tipi di dati e utilizzare i metodi disponibili per gli oggetti.

---

## 📌 Tipi di Dati

### 🏗️ **Primitive Types (Tipi Primitivi)**
I tipi primitivi sono i più basilari in Java. Non sono oggetti e vengono memorizzati direttamente nella memoria.

| Tipo      | Valori Possibili                              | Dimensione |
|-----------|-----------------------------------------------|------------|
| `boolean` | `true` o `false`                              | 1 bit      |
| `byte`    | -128 a 127                                    | 1 byte     |
| `short`   | -32,768 a 32,767                              | 2 byte     |
| `int`     | -2 miliardi a 2 miliardi                      | 4 byte     |
| `long`    | -9 quintilioni a 9 quintilioni                | 8 byte     |
| `float`   | Numero decimale con 6-7 cifre di precisione   | 4 byte     |
| `double`  | Numero decimale con 15-16 cifre di precisione | 8 byte     |
| `char`    | Un singolo carattere (es. 'A')                | 2 byte     |

> **Nota:** Il tipo `long` richiede una **L** finale (`L` o `l`) per evitare errori. Il tipo `float` richiede una **F** finale (`F` o `f`).

Esempio:
```java
long numeroLungo = 9223372036854775807L;
float numeroFloat = 5.123456F;
```

---

### 🏗️ **Reference Types (Tipi di Riferimento)**
I tipi di riferimento non contengono direttamente il valore, ma un **riferimento** a un'area di memoria che memorizza il valore effettivo.

| Tipo      | Descrizione |
|-----------|------------|
| `String`  | Una sequenza di caratteri (es. "Ciao mondo!") |
| `Array`   | Una collezione ordinata di elementi |
| `Class`   | Una definizione di oggetti con attributi e metodi |
| `Interface` | Un modello per definire metodi in una classe |

Esempio:
```java
String messaggio = "Hello, Java!";
System.out.println(messaggio.toUpperCase()); // Output: HELLO, JAVA!
```

> **Nota:** A differenza delle variabili primitive, le reference possono avere il valore `null`, indicando che non puntano a nessun oggetto.

---

## 💻 Codice di esempio

```java
public class Main {
    public static void main(String[] args) {
        // Tipi primitivi
        boolean ilBoolean = true;
        byte ilByte = 126;
        short loShort = -32766;
        int lIntero = 2_000_000_000; // Possiamo usare "_" per migliorare la leggibilità
        long ilLong = 9_223_372_036_854_775_807L; // "L" finale obbligatoria
        
        float ilFloat = 6.345623f; // "f" finale obbligatoria
        double ilDouble = 5.123526236701522;
        
        char ilChar = 'd';
        
        // Tipi di riferimento
        String laStringa = "Questa è una stringa";
        System.out.println(laStringa.toUpperCase()); // Converte la stringa in maiuscolo
    }
}
```

---

## 🔍 Differenze tra Primitive & Reference

| Caratteristica   | Primitive                | Reference                                     |
|------------------|--------------------------|-----------------------------------------------|
| Memorizzazione   | Memorizzati direttamente | Memorizzati in heap, con riferimento in stack |
| Nullabile?       | No                       | Sì, possono essere `null`                     |
| Metodi associati | Nessuno                  | Hanno metodi (es. `toUpperCase()`)            |
| Prestazioni      | Più veloci               | Più lenti                                     |

### 📌 Stack vs Heap
- **Stack**: È una memoria veloce e di dimensioni limitate. Contiene le variabili primitive e i riferimenti agli oggetti.
- **Heap**: È una memoria più grande e più lenta, dove vengono effettivamente memorizzati gli oggetti creati con `new` (verrà approfondito successivamente).

Esempio di differenza:
```java
int numero = 10;
String testo = "Java";
System.out.println(testo.toUpperCase()); // Possibile con String, ma non con int
```

---

## 📌 Concetti Chiave

- I **tipi primitivi** memorizzano direttamente il valore.
- I **tipi di riferimento** memorizzano un **puntatore** all'oggetto in memoria.
- Le **Stringhe** e altri tipi reference hanno metodi utili come `.toUpperCase()`.
- Per dichiarare un **long** o un **float**, è necessario aggiungere `L` o `F`.
- Le **variabili reference possono essere `null`**, mentre le primitive no.

---

Buona programmazione! 👨‍💻✨

