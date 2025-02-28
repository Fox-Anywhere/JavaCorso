# 📚 Lezione 8: Condizioni con `if` in Java

In questa lezione esploreremo le **istruzioni condizionali** in Java, inclusi `if`, `else`, `else if` e l'operatore ternario.

---

## 🔥 Obiettivi della Lezione

- Utilizzare le strutture condizionali `if`, `else`, `else if`.
- Gestire condizioni **annidate** per verifiche più complesse.
- Comprendere e applicare l'**operatore ternario**.

---

## 🖥️ Strutture Condizionali

Le **istruzioni condizionali** permettono di eseguire blocchi di codice solo se certe condizioni sono soddisfatte.

### **Struttura di base di `if`**

```java
if (condizione) {
    // Codice eseguito se la condizione è vera
} else if (altra_condizione) {
    // Codice eseguito se la prima condizione è falsa ma questa è vera
} else {
    // Codice eseguito se nessuna condizione precedente è vera
}
```

### **Esempio con stringhe**
> **Attenzione**: In futuro vedremo che per confrontare le stringhe in Java si usa `equals()` invece di `==`.

```java
String nome = "Giovanni";
if (nome == "Marco") {
    System.out.println(nome + " è online");
} else if (nome == "Luca") {
    System.out.println(nome + " è online");
} else {
    System.out.println("Sia Luca che Marco sono offline, ma " + nome + " è online");
}
```

### **Esempio con numeri interi**
```java
int numero = 20;

if (numero < 10) {
    System.out.println("È minore di 10");
    if (numero % 2 == 0) {
        System.out.println("È pari");
    } else {
        System.out.println("È dispari");
    }
} else {
    System.out.println("È maggiore di 10");
}
```

### **Operatore Ternario**
L'operatore ternario è una forma compatta dell'`if`.

```java
int numero1 = 11;
String risultato = numero1 < 10 ? numero1 + " è minore di 10" : numero1 + " è maggiore di 10";
System.out.println(risultato);
```

---

## 📌 Concetti Chiave

- Le strutture `if`, `else if`, `else` permettono di gestire condizioni logiche.
- Gli **if annidati** consentono controlli più dettagliati.
- Per confrontare stringhe, usare `equals()` invece di `==`.
- L'**operatore ternario** semplifica le condizioni in un'unica linea.

---

Buona programmazione! 👨‍💻✨