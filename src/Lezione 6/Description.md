# 📚 Lezione 6: Operatori di Comparazione in Java

In questa lezione esploreremo gli **operatori di comparazione** in Java, fondamentali per prendere decisioni nel codice.

---

## 🔥 Obiettivi della Lezione

- Comprendere l'uso degli **operatori di comparazione**.
- Valutare **espressioni booleane** basate su confronti tra valori.
- Utilizzare gli operatori di confronto nei blocchi `if`.

---

## 🖥️ Operatori di Comparazione

Gli **operatori di comparazione** vengono utilizzati per confrontare due valori e restituiscono un risultato **booleano** (`true` o `false`).

| Operatore | Descrizione                | Esempio           |
|-----------|----------------------------|-------------------|
| `>`       | Maggiore di                | `5 > 2` → `true`  |
| `>=`      | Maggiore o uguale a        | `5 >= 5` → `true` |
| `<`       | Minore di                  | `10 < 3` → `false`|
| `<=`      | Minore o uguale a          | `3 <= 3` → `true` |
| `==`      | Uguale a                   | `4 == 4` → `true` |
| `!=`      | Diverso da                 | `5 != 3` → `true` |

---

## 💻 Codice di esempio

```java
public class Main {
    public static void main(String[] args) {
        boolean risultato = 3 > 10;
        
        if (risultato) { //if (se) la condizione è vera allora dai "La condizione è vera"
            System.out.println("La condizione è vera");
        } else {        //else (sennò) la condizione è falsa, allora dai "La condizione è falsa"
            System.out.println("La condizione è falsa");
        }
        
        System.out.println("Risultato del confronto: " + risultato);
    }
}
```

---

## 📌 Concetti Chiave

- Gli **operatori di comparazione** restituiscono un valore booleano (`true` o `false`).
- Possono essere usati in strutture condizionali come `if`.
- Il confronto tra numeri aiuta a gestire il flusso del programma.

---

Buona programmazione! 👨‍💻✨

