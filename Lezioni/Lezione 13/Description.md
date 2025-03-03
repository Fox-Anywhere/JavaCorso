# 📚 Lezione 13: Array 2D in Java

In questa lezione esploreremo gli **Array 2D** in Java, vedendo come crearli, modificarli e iterarli con cicli `for` e `for-each`.

---

## 🔥 Obiettivi della Lezione

- Comprendere il concetto di **Array 2D** e il loro utilizzo.
- Creare un **Array 2D** con diversi metodi.
- Accedere e modificare elementi di un **Array 2D**.
- Iterare su un **Array 2D** usando `for` classico e `for-each`.

---

## 📌 Cosa sono gli Array 2D?

Gli **Array 2D** (o **array multidimensionali**) sono array contenenti altri array, rappresentando così una **tabella** di valori.

```java
// Dichiarazione di un array 2D vuoto (3x3)
String[][] classi = new String[3][3];
```

> **Nota**: Gli array 2D in Java sono **array di array**, quindi ogni riga può avere una lunghezza diversa.

---

## 🖥️ Creazione e Modifica di un Array 2D

### **1️⃣ Creazione di un Array 2D vuoto**

```java
String[][] classi = new String[3][3];
```

### **2️⃣ Assegnare Valori all'Array 2D**

```java
classi[0][0] = "Luca";
classi[0][1] = "Anna";
classi[0][2] = "Marco";
```

### **3️⃣ Creazione e Inizializzazione Diretta**

```java
String[][] paesi = {
    {"Italia", "Roma", "Milano"},
    {"Francia", "Parigi", "Lione"},
    {"Spagna", "Madrid", "Barcellona"}
};
```

---

## 🔄 Iterare un Array 2D

### **4️⃣ Stampare un Array 2D con `for` classico**

```java
for (int i = 0; i < paesi.length; i++) {
    for (int j = 0; j < paesi[i].length; j++) {
        System.out.print(paesi[i][j] + " ");
    }
    System.out.println();
}
```

### **5️⃣ Stampare un Array 2D con `for-each`**

```java
for (String[] paese : paesi) {
    for (String citta : paese) {
        System.out.print(citta + " ");
    }
    System.out.println();
}
```

---

## 💻 Codice di esempio

```java
public class Array2D {
    public static void main(String[] args) {
        String[][] classi = new String[3][3];
        
        // Assegnazione di valori
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";
        
        String[][] paesi = {
            {"Italia", "Roma", "Milano"},
            {"Francia", "Parigi", "Lione"},
            {"Spagna", "Madrid", "Barcellona"}
        };

        System.out.println("\nPaesi e città:");
        for (int i = 0; i < paesi.length; i++) {
            for (int j = 0; j < paesi[i].length; j++) {
                System.out.print(paesi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nStudenti nelle classi:");
        for (int i = 0; i < classi.length; i++) {
            for (int j = 0; j < classi[i].length; j++) {
                System.out.print(classi[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOutput con FOR-EACH:");
        for (String[] paese : paesi) {
            for (String citta : paese) {
                System.out.print(citta + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 📌 Concetti Chiave

- Gli **Array 2D** permettono di rappresentare dati in forma di **tabelle**.
- Possiamo creare un **Array 2D vuoto** e poi assegnare valori, oppure **inizializzarlo direttamente**.
- Gli **elementi si accedono tramite due indici**, uno per la riga e uno per la colonna.
- È possibile iterare su un **Array 2D** con un **ciclo `for` classico** o con **`for-each`**.

---

Buona programmazione! 👨‍💻✨