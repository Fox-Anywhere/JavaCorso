# 📚 Lezione 12: Array in Java

In questa lezione esploreremo gli **Array**, una delle strutture dati fondamentali in Java, e vedremo come crearli, modificarli e iterarli con cicli.

---

## 🔥 Obiettivi della Lezione

- Capire cosa sono gli **Array** e perché sono utili.
- Creare e inizializzare un **Array vuoto**.
- Assegnare e modificare **elementi di un Array**.
- Usare `length` per ottenere la **dimensione dell'Array**.
- Iterare su un Array con **for classico** e **for-each**.

---

## 📌 Cosa sono gli Array?

Un **Array** è una struttura dati che permette di memorizzare più valori dello stesso tipo in una sola variabile.

```java
// Dichiarazione di un array di interi con lunghezza fissa
int[] numeri = new int[5];
```

> **Nota**: Gli array in Java hanno **dimensione fissa** e non possono essere ridimensionati dopo la creazione.

---

## 🖥️ Creazione e Modifica di un Array

### **1️⃣ Creare un Array Vuoto**

Gli elementi di un array vuoto vengono inizializzati con valori di default:

```java
int[] numeri = new int[5]; // Tutti gli elementi sono 0 di default
```

### **2️⃣ Assegnare Valori all'Array**

```java
numeri[0] = 10;
numeri[1] = 20;
numeri[2] = 30;
numeri[3] = 40;
numeri[4] = 50;
```

### **3️⃣ Ottenere la Lunghezza di un Array**

```java
System.out.println("Lunghezza dell'array: " + numeri.length);
```

### **4️⃣ Modificare un Elemento dell'Array**

```java
numeri[2] = 100; // Modifica il terzo elemento (indice 2)
```

---

## 🔄 Iterare un Array

### **5️⃣ Stampare Elementi con un Ciclo `for`**

```java
for (int i = 0; i < numeri.length; i++) {
    System.out.println("Elemento " + i + ": " + numeri[i]);
}
```

### **6️⃣ Stampare Elementi con un Ciclo `for-each`**

```java
for (int num : numeri) {
    System.out.println("Elemento: " + num);
}
```

---

## 💻 Codice di esempio

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        
        // Assegnazione di valori
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        numeri[3] = 40;
        numeri[4] = 50;

        System.out.println("Array iniziale:");
        stampaArray(numeri);

        // Modifica di un valore
        numeri[2] = 100;
        System.out.println("\nArray dopo modifica:");
        stampaArray(numeri);

        // Iterazione con for classico
        System.out.println("\nIterazione con FOR classico:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Elemento " + i + ": " + numeri[i]);
        }

        // Iterazione con for-each
        System.out.println("\nIterazione con FOR-EACH:");
        for (int num : numeri) {
            System.out.println("Elemento: " + num);
        }
    }

    public static void stampaArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
```

---

## 📌 Concetti Chiave

- Gli **Array** permettono di memorizzare più elementi dello stesso tipo.
- La dimensione di un Array è **fissa** e si ottiene con `.length`.
- Gli elementi di un Array si modificano tramite **indice**.
- È possibile iterare un Array con **for classico** e **for-each**.

---

Buona programmazione! 👨‍💻✨

