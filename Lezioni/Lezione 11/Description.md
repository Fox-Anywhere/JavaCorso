# 📚 Lezione 11: Cicli `for` in Java

In questa lezione esploreremo il **ciclo `for`**, inclusi il ciclo **annidato**, la versione **for-each** e l'uso di **break** e **continue**.

---

## 🔥 Obiettivi della Lezione

- Comprendere il funzionamento del **ciclo `for`**.
- Usare **cicli annidati** per gestire più livelli di iterazione.
- Sfruttare il **for-each** per iterare su array e collezioni.
- Applicare **break** e **continue** per controllare il flusso del ciclo.
> Gli _**array**_ verranno spiegati meglio successivamente

---

## 🔄 Struttura del Ciclo `for`

Il ciclo `for` consente di eseguire un blocco di codice un numero definito di volte.

### **Sintassi**:
```java
for (inizializzazione; condizione; aggiornamento) {
    // Codice eseguito in ogni iterazione
}
```

---

## 🖥️ Varianti del Ciclo `for`

### **1️⃣ Ciclo `for` base**
Itera da un valore iniziale a uno finale con un incremento definito.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iterazione: " + i);
}
```

### **2️⃣ Ciclo `for` annidato**
Utilizzato per iterazioni multiple, come la stampa di una matrice.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
    System.out.println();
}
```

### **3️⃣ Ciclo `for-each` (enhanced for loop)**
Utilizzato per iterare su array e collezioni.

```java
int[] numeri = {10, 20, 30, 40, 50};
for (int num : numeri) {
    System.out.println("Numero: " + num);
}
```

### **4️⃣ Uso di `break`**
Interrompe l'esecuzione del ciclo quando una condizione è soddisfatta.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        System.out.println("Interruzione del ciclo con BREAK!");
        break;
    }
    System.out.println("Iterazione: " + i);
}
```

### **5️⃣ Uso di `continue`**
Salta un'iterazione senza interrompere il ciclo.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        System.out.println("Salto l'iterazione " + i + " con CONTINUE!");
        continue;
    }
    System.out.println("Iterazione: " + i);
}
```

---

## 📌 Concetti Chiave

- Il **ciclo `for`** è utile per iterazioni ripetitive con un numero definito di passaggi.
- I **cicli annidati** permettono di iterare su strutture più complesse.
- Il **for-each** semplifica l'iterazione su array e collezioni.
- Il **`break`** interrompe il ciclo quando una condizione è soddisfatta.
- Il **`continue`** salta l'iterazione corrente e passa alla successiva.

---

Buona programmazione! 👨‍💻✨

