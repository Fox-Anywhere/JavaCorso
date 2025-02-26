# 📚 Lezione 5: La Classe `Math` in Java

In questa lezione esploreremo la **classe `Math`** in Java, che fornisce metodi utili per eseguire calcoli matematici avanzati.

---

## 🔥 Obiettivi della Lezione

- Utilizzare i principali **metodi della classe `Math`**.
- Calcolare valori matematici come **potenze, radici quadrate e valori assoluti**.
- Conoscere l'attributo **`PI`** per il valore di π.

---

## 🖥️ Metodi Principali della Classe `Math`

La classe `Math` offre molte funzioni per operazioni matematiche comuni:

| Metodo            | Descrizione                                 | Esempio                         |
|-------------------|---------------------------------------------|---------------------------------|
| `Math.abs(x)`     | Restituisce il valore assoluto di `x`       | `Math.abs(-5) // 5`             |
| `Math.min(a, b)`  | Restituisce il valore minimo tra `a` e `b`  | `Math.min(5, 2) // 2`           |
| `Math.max(a, b)`  | Restituisce il valore massimo tra `a` e `b` | `Math.max(5, 2) // 5`           |
| `Math.pow(x, y)`  | Calcola `x` elevato alla `y` (potenza)      | `Math.pow(2, 3) // 8.0`         |
| `Math.sqrt(x)`    | Restituisce la radice quadrata di `x`       | `Math.sqrt(25) // 5.0`          |
| `Math.PI`         | Costante che rappresenta il valore di π     | `Math.PI // 3.141592653589793`  |

> **Nota:** La classe `Math` è parte della libreria Java e non necessita di importazione.

---

## 💻 Codice di esempio

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.abs(-55));  // Valore assoluto
        System.out.println(Math.min(55, 21));   // Minimo tra due numeri
        System.out.println(Math.pow(5, 2));     // 5^2
        System.out.println(Math.sqrt(25));      // Radice quadrata di 25
        System.out.println(Math.PI);           // Valore di π
    }
}
```

---

## 📌 Concetti Chiave

- La classe `Math` offre funzioni per calcoli <s> comuni.
- `Math.abs()` rimuove il segno negativo.
- `Math.min()` e `Math.max()` trovano il valore più piccolo o più grande tra due numeri.
- `Math.pow()` calcola la potenza di un numero.
- `Math.sqrt()` calcola la radice quadrata.
- `Math.PI` è una costante che rappresenta il valore di π.

---

Buona programmazione! 👨‍💻✨

