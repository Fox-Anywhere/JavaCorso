# 📚 Lezione 7: Operatori Logici in Java

In questa lezione esploreremo gli **operatori logici** in Java, che permettono di combinare espressioni booleane.

---

## 🔥 Obiettivi della Lezione

- Comprendere l'uso degli **operatori logici**.
- Combinare più condizioni utilizzando `&&`, `||`, `!`.

---

## 🖥️ Operatori Logici

Gli **operatori logici** vengono utilizzati per combinare più espressioni booleane e restituire un valore **true** o **false**.

| Operatore | Nome       | Descrizione                                                 | Esempio                       |
|-----------|------------|-------------------------------------------------------------|-------------------------------|
| `&&`      | AND        | Restituisce `true` solo se entrambe le condizioni sono vere | `(5 > 2 && 3 < 10)` → `true`  |
| `||`      | OR         | Restituisce `true` se almeno una condizione è vera          | `(5 > 10 || 3 < 10)` → `true` |
| `!`       | NOT        | Inverte il valore di un'espressione booleana                | `!(5 > 2)` → `false`          |

---

## 💻 Codice di esempio

```java
public class Main {
    public static void main(String[] args) {
        boolean x = 3 < 10 && 3 % 2 == 0;
        boolean y = 3 > 10 || 16 % 2 == 0;

        System.out.println(x);  // AND
        System.out.println(y);  // OR
        System.out.println(!x); // NOT
    }
}
```

---

## 📌 Concetti Chiave

- Gli **operatori logici** combinano espressioni booleane.
- `&&` (AND) restituisce `true` solo se entrambe le condizioni sono vere.
- `||` (OR) restituisce `true` se almeno una condizione è vera.
- `!` (NOT) inverte il valore booleano.
- Utili nei blocchi `if` per controllare condizioni multiple.

---

Buona programmazione! 👨‍💻✨