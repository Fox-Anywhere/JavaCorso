# 📚 Lezione 10: Cicli `while` e `do-while` in Java

In questa lezione esploreremo i **cicli** in Java, in particolare `while` e `do-while`, fondamentali per eseguire blocchi di codice in modo ripetuto.

---

## 🔥 Obiettivi della Lezione

- Comprendere il concetto di **ciclo** e il suo utilizzo.
- Utilizzare il **ciclo `while`** per eseguire codice finché una condizione è vera.
- Capire la differenza tra **`while` e `do-while`**.

---

## 🔄 Cos'è un Ciclo e a Cosa Serve?

Un **ciclo** è una struttura di controllo che ripete un blocco di codice **fino a quando** una condizione rimane vera. Questo è utile per evitare ripetizioni manuali di istruzioni.

Esempi di utilizzo:
- Stampare numeri da 1 a 10.
- Controllare input utente finché non è valido.
- Ripetere un'operazione finché una condizione è soddisfatta.

---

## 🖥️ Il Ciclo `while`

Il ciclo `while` verifica la condizione **prima** di eseguire il codice. Se la condizione è falsa all'inizio, il codice **non viene mai eseguito**.

### **Sintassi**:
```java
while (condizione) {
    // Codice ripetuto finché la condizione è vera
}
```

### **Esempio**:
```java
int x = 0;
while (x < 5) {
    System.out.println("Valore di x: " + x);
    x++;
}
```

---

## 🖥️ Il Ciclo `do-while`

Il ciclo `do-while` esegue **almeno una volta** il blocco di codice, perché la condizione viene controllata **dopo** l'esecuzione.

### **Sintassi**:
```java
do {
    // Codice eseguito almeno una volta
} while (condizione);
```

### **Esempio**:
```java
int y = 0;
do {
    System.out.println("Valore di y: " + y);
    y++;
} while (y < 5);
```

---

## 💻 Codice di esempio

```java
public class WhileVsDoWhile {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("Esempio con WHILE:");
        while (a < 5) { // La condizione è FALSA all'inizio
            System.out.println("Questo messaggio non verrà mai stampato!");
        }

        System.out.println("\nEsempio con DO-WHILE:");
        do {
            System.out.println("Questo messaggio viene stampato almeno una volta!");
        } while (b < 5); // La condizione è FALSA, ma il codice è già stato eseguito

        System.out.println("\nFine del programma.");
    }
}
```

---

## 📌 Differenza tra `while` e `do-while`

| Ciclo      | Quando viene eseguito?                                           |
|------------|------------------------------------------------------------------|
| `while`    | **Solo se** la condizione è vera dall'inizio.                    |
| `do-while` | **Sempre almeno una volta**, poi ripete se la condizione è vera. |

---

## 📌 Concetti Chiave

- I **cicli** evitano la ripetizione manuale del codice.
- Il **`while`** esegue il codice **solo se** la condizione è vera.
- Il **`do-while`** esegue il codice **almeno una volta**, poi verifica la condizione.

---

Buona programmazione! 👨‍💻✨

