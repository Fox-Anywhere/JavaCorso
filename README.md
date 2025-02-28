# 📘 Corso di Programmazione in Java

Benvenuto nel repository dedicato alle lezioni di **programmazione in Java**! 🚀

In questo repository troverai tutto il necessario per iniziare e approfondire la programmazione in Java, dal livello base fino a concetti più avanzati. Ogni lezione è corredata di esempi pratici, spiegazioni dettagliate e codice ben documentato.

---

## 📑 Contenuto del Corso

Le lezioni sono organizzate in ordine progressivo, per accompagnarti passo dopo passo nella comprensione del linguaggio Java. Ecco una panoramica degli argomenti trattati:

1. **Introduzione a Java**
   - Struttura di un programma Java
   - Compilazione ed esecuzione del codice
   - Il metodo `main` e le classi

2. **Tipi di Dati in Java** 
   - Tipi primitivi: boolean, numeri interi, decimali, caratteri.  
   - Tipi di riferimento: String, Array, Class, Interface.  
   - Stack vs Heap: differenza nell'allocazione della memoria.  
   - Esempi pratici: dichiarazione e utilizzo delle variabili.

3. **Input Utente in Java**  
   - Uso di `Scanner` per leggere input dalla tastiera.  
   - Lettura di vari tipi di dati (`String`, `int`).  
   - Problema con `nextInt()` e `nextLine()` e soluzione.  
   - Concatenazione di stringhe per generare output personalizzati.

4. **Operazioni Aritmetiche in Java**  
   - Operatori aritmetici: `+`, `-`, `*`, `/`, `%`.  
   - Shorthand: `+=`, `-=`, `*=`, `/=`, `%=` per operazioni rapide.  
   - Incremento e decremento: `++`, `--` per modificare il valore di una variabile.  
   - Espressioni complesse combinando operatori matematici.

5. **La Classe `Math` in Java**  
   - Metodi principali: `abs()`, `min()`, `max()`, `pow()`, `sqrt()`.  
   - Calcoli matematici: valore assoluto, minimo, massimo, potenze, radici quadrate.  
   - Attributo `PI`: rappresenta il valore di π.

6. **Operatori di Comparazione in Java**  
   - Operatori principali: `>`, `>=`, `<`, `<=`, `==`, `!=`.  
   - Valutazione booleana: confronti che restituiscono `true` o `false`.  
   - Utilizzo nei blocchi `if` per prendere decisioni nel codice.

7. **Operatori Logici in Java**  
   - Operatori principali: `&&` (AND), `||` (OR), `!` (NOT).  
   - Combinazione di espressioni booleane per valutare condizioni multiple.  

8. **Condizioni con `if` in Java**  
   - Strutture condizionali: `if`, `else if`, `else`.  
   - If annidati per verifiche più dettagliate. 
   - Operatore ternario per condizioni compatte.

9. **Switch in Java**  
   - Alternativa a `if-else` multipli per maggiore leggibilità.  
   - Supporta numeri e stringhe per selezionare blocchi di codice.  
   - Switch con espressioni lambda (Java 14+) per una sintassi più compatta.  
   - Uso del `break` per evitare l'esecuzione dei case successivi.
---

## 🛠️ Requisiti

Prima di iniziare, assicurati di avere installato:

- **Java Development Kit (JDK)** - Versione 8 o superiore  
  👉 [Scarica qui](https://www.oracle.com/java/technologies/javase-downloads.html)

- **Un IDE o editor di testo** (opzionale ma consigliato)
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Eclipse](https://www.eclipse.org/)
  - [Visual Studio Code](https://code.visualstudio.com/)

---

## 🚀 Come Eseguire il Codice

1. Clona il repository:

   ```bash
   git clone https://github.com/Fox-Anywhere/JavaCorso.git
   cd lezioni-java
   ```

2. Compila il codice:

   ```bash
   javac NomeFile.java
   ```

3. Esegui il programma:

   ```bash
   java NomeClasse
   ```

> 🔑 **Nota:** Il nome della classe deve corrispondere al nome del file Java.

---

## 📂 Struttura del Repository

```bash
📁 lezioni-java/
│
├── 📜 LICENSE            # Licenza del progetto
├── 📜 README.md          # Descrizione del progetto
├── 📁 Lezione_01/        # Introduzione e basi di Java
│   └── Main.java
│
├── 📁 Lezione_02/        # Variabili e tipi di dati
│   └── Variabili.java
│
├── 📁 Lezione_03/        # Strutture di controllo
│   └── Condizioni.java
│
└── 📁 Progetti/          # Progetti pratici
    └── Calcolatrice.java
```

---

## 🛠️ Come Contribuire
1. **Fai un fork del repository**
   - Clicca su **Fork** in alto a destra per creare una copia del repository nel tuo account GitHub.

2. **Clona il repository forkolato** nel tuo computer:
   ```bash
   git clone https://github.com/tuo-username/Java-Course.git
   cd Java-Course
   ```

3. **Crea un nuovo branch per le tue modifiche**:
   ```bash
   git checkout -b nome-del-tuo-branch
   ```

4. **Apporta le modifiche e fai il commit**:
   ```bash
   git add .
   git commit -m "Descrizione delle modifiche"
   ```

5. **Pusha il tuo branch su GitHub**:
   ```bash
   git push origin nome-del-tuo-branch
   ```

6. **Apri una Pull Request (PR)**
   - Vai su [GitHub](https://github.com/) nel tuo fork.
   - Clicca su **Contribute → Open pull request**.
   - Assicurati che la PR sia indirizzata al branch `main` del repository originale.
   - Scrivi una descrizione chiara delle modifiche.

7. **Attendi la revisione**
   - Il team manterrà la revisione delle Pull Request.
   - Potremmo chiedere modifiche prima dell’approvazione.
   - Una volta approvata, la tua modifica verrà unita al branch `main`.

## 📌 Regole Importanti
- **Non modificare il branch `main` direttamente**.
- **Scrivi commit chiari e descrittivi**.
- **Segui lo stile del codice già presente**.
- **Le modifiche devono essere testate prima di inviare una PR**.
- **Usa `Issues` per suggerire miglioramenti o segnalare problemi**.

Grazie per il tuo contributo! 🚀

---

## 📜 Licenza

Questo progetto è distribuito sotto licenza [MIT](LICENSE).

---

## 🎓 Crediti e Riferimenti

Questo corso è basato sulla playlist di **Edoardo Midali** su YouTube.  
Puoi trovare il corso originale qui:  
📺 **[Playlist: Programmazione in Java](https://youtube.com/playlist?list=PLP5MAKLy8lP9wbmTi6c4-tmqzyOtLglGP&si=R7jk91BIq-LntIB7)**  
👤 **[Canale di Edoardo Midali](https://www.youtube.com/@EdoardoMidali)**  

---

## 📧 Contatti

Per domande o suggerimenti, sentiti libero di contattarmi su [LinkedIn](https://www.linkedin.com/in/davide-d-amico-/) o di aprire una nuova issue.

Buono studio e buona programmazione! 👨‍💻✨