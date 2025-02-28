# 📚 Lezione 4: Operazioni Aritmetiche in Java

In questa lezione esploreremo le **operazioni aritmetiche** in Java, inclusi gli **operatori base**, l'uso delle **shorthand** e l'incremento/decremento delle variabili.

---

## 🔥 Obiettivi della Lezione

- Utilizzare gli **operatori aritmetici**.
- Applicare le **shorthand** per operazioni rapide.
- Comprendere l'**incremento e decremento** delle variabili.
- Scrivere espressioni complesse con più operatori.

---

## 🖥️ Operatori Aritmetici

Gli **operatori aritmetici** permettono di eseguire calcoli matematici:

| Operatore | Descrizione             | Esempio  |
|-----------|-------------------------|----------|
| `+`       | Addizione               | `a + b`  |
| `-`       | Sottrazione             | `a - b`  |
| `*`       | Moltiplicazione         | `a * b`  |
| `/`       | Divisione               | `a / b`  |
| `%`       | Modulo (resto)          | `a % b`  |

Esempio:
```java
int somma = 10 + 2; // 12
int sottrazione = 10 - 2; // 8
int moltiplicazione = 10 * 2; // 20
int divisione = 10 / 2; // 5
int modulo = 10 % 3; // 1
```

---

## ✨ Shorthand (Assegnazione Composta)

Possiamo scrivere operazioni più rapidamente usando **shorthand**:

| Operatore | Equivalente a |
|-----------|--------------|
| `a += b`  | `a = a + b`  |
| `a -= b`  | `a = a - b`  |
| `a *= b`  | `a = a * b`  |
| `a /= b`  | `a = a / b`  |
| `a %= b`  | `a = a % b`  |

Esempio:
```java
int x = 5;
x += 3; // x diventa 8
x *= 2; // x diventa 16
```

---

## 📈 Incremento e Decremento

Java offre operatori speciali per **incrementare o decrementare** il valore di una variabile:

| Operatore | Effetto  |
|-----------|----------|
| `a++`     | Incrementa `a` di 1  |
| `a--`     | Decrementa `a` di 1  |

Esempio:
```java
int numero = 10;
numero++; // 11
numero--; // 10
```

> **Nota:** `a++` incrementa dopo l'uso della variabile, mentre `++a` incrementa prima.

---

## 💻 Codice di esempio

```java
public class Main {
    public static void main(String[] args) {
        int primoDato = 10;
        int secondoDato = 2;
        int risultatoAddizione = primoDato + secondoDato;
        int risultatoSottrazione = primoDato - secondoDato;
        int risultatoDivisione = primoDato / secondoDato;
        int risultatoMoltiplicazione = primoDato * secondoDato;
        int risultatoModulo = primoDato % secondoDato;

        System.out.println("I dati sono: \nPrimo dato: " + primoDato + "\nSecondo dato: " + secondoDato);
        System.out.println("Addizione: " + risultatoAddizione);
        System.out.println("Sottrazione: " + risultatoSottrazione);
        System.out.println("Moltiplicazione: " + risultatoMoltiplicazione);
        System.out.println("Divisione: " + risultatoDivisione);
        System.out.println("Modulo (resto): " + risultatoModulo);

        int a = 0;
        a += 3; // Shorthand per somma
        a++;
        System.out.println("Valore aggiornato di a: " + a);

        int risultato = ((primoDato + secondoDato) * primoDato + (4 - 2)) * a;
        System.out.println("Risultato espressione complessa: " + risultato);
    }
}
```

---

## 📌 Concetti Chiave

- Gli **operatori aritmetici** permettono di eseguire calcoli base.
- Le **shorthand** semplificano le operazioni di assegnazione.
- **Incremento e decremento** modificano rapidamente il valore di una variabile.
- Possiamo creare **espressioni più complesse** combinando operatori.

---

Buona programmazione! 👨‍💻✨

