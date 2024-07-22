
Diese README-Datei beschreibt detailliert die Architektur und Komponenten der Flashcards-App ohne den eigentlichen Quellcode, bietet aber alle notwendigen Informationen, um das Projekt zu verstehen und auszuführen.

# Flashcards App

Dies ist eine Java-Anwendung, die eine Flashcards-App implementiert. Die Anwendung zeigt eine Willkommensseite mit einem Hintergrundbild und einem Button zum Weiterblättern. Sie lädt Fragen aus einer JSON-Datei, die auf der zweiten Seite angezeigt werden.

## Projektübersicht

Das Projekt ist als Paket entwickelt und besteht aus folgenden Dateien und Ressourcen:

### Paketstruktur

### Paket- und Verzeichnisstruktur

```
project/
├── src/
│   └── com/
│       └── bbq/
│           └── flashcards/
│               ├── Main.java
│               ├── TemplateFrame.java
│               ├── WelcomeFrame.java
│               └── NextPageFrame.java
├── resources/
│   ├── images/
│   │   ├── background.png
│   │   ├── icons8-close-32.png
│   │   ├── icons8-menu.png
│   │   └── icons8-next-page-48.png
│   └── questions.json
└── libs/
└── json-20240303.jar
```


### Beschreibung der Pakete und Dateien

### Zusammenfassung
 "Software- Architektur" ist die Struktur und das Design der Anwendung, einschließlich der Art und Weise, wie die verschiedenen Komponenten und Module organisiert und miteinander verbunden sind.
Die Flashcards-App ist deshalb durch eine klare Trennung von Zuständigkeiten, Wiederverwendbarkeit und Modularität gekennzeichnet. Durch die Verwendung von Paketen, abstrakten Klassen und externen Ressourcen wird die Anwendung strukturiert und wartbar gestaltet. Die Trennung von Geschäftslogik und Darstellung ermöglicht eine saubere und flexible Entwicklung der Anwendung.


### Schlüsselaspekte der Architektur
**Paketstruktur:** Die Anwendung ist in mehrere Java-Pakete unterteilt, die die logische Organisation des Codes unterstützen. Die Pakete folgen dem Namensschema ```com.bbq.flashcards```, was die Unternehmens- oder Projektzugehörigkeit und den spezifischen Anwendungsbereich widerspiegelt.

**Modularität:** Die Anwendung ist modular aufgebaut, wobei jede Klasse eine bestimmte Funktionalität implementiert. Dies erleichtert die Wartung und Erweiterung des Codes.

**Abstraktion:** Die abstrakte Klasse TemplateFrame bietet eine allgemeine Vorlage für die verschiedenen Fenster der Anwendung. Dies fördert die Wiederverwendbarkeit und sorgt für Konsistenz im Design der Benutzeroberfläche.

**Trennung von Logik und Darstellung:** Die Geschäftslogik (z.B. das Laden von Fragen aus der JSON-Datei) ist von der Darstellungsschicht (Benutzeroberfläche) getrennt. Dies wird durch Klassen wie NextPageFrame und WelcomeFrame erreicht, die jeweils spezifische Aspekte der Benutzeroberfläche verwalten.

**Ressourcenverwaltung:** Externe Ressourcen wie Bilder und JSON-Dateien werden in einem separaten resources-Verzeichnis verwaltet. Dies ermöglicht eine einfache Verwaltung und Anpassung der Ressourcen, ohne den Quellcode selbst ändern zu müssen.

**Verwendung von Bibliotheken:** Die JSON-Bibliothek (json-20240303.jar) wird verwendet, um Daten aus der questions.json Datei zu laden und zu verarbeiten. Dies zeigt die Nutzung externer Bibliotheken zur Erweiterung der Funktionalität der Anwendung.

## Beschreibung der Pakete und Dateien
>>>>>>> 9077b44 (Add Codemagic CI/CD config , Gradle, README)

#### src/com/bbq/flashcards/Main.java

Dies ist der Einstiegspunkt der Anwendung. Hier wird das Hauptfenster (`WelcomeFrame`) der Anwendung gestartet.

#### src/com/bbq/flashcards/TemplateFrame.java

Diese abstrakte Klasse dient als Vorlage für die verschiedenen Fenster der Anwendung. Sie stellt die gemeinsame Funktionalität bereit, wie z.B. das Einrichten der Fenstergröße, der Menüleiste und des Hintergrundbilds.

#### src/com/bbq/flashcards/WelcomeFrame.java

Diese Klasse erweitert `TemplateFrame` und fügt benutzerdefinierte Inhalte hinzu, die auf der Willkommensseite angezeigt werden. Dazu gehören das Logo, der Begrüßungstext und die Überschrift.

#### src/com/bbq/flashcards/NextPageFrame.java

Diese Klasse erweitert `TemplateFrame` und zeigt die Fragen aus der JSON-Datei auf der zweiten Seite an.

### Ressourcen

#### resources/images/background.png

Das Hintergrundbild, das auf den verschiedenen Seiten der Anwendung verwendet wird.

#### resources/images/icons8-close-32.png

Das Schließen-Symbol, das in der Menüleiste verwendet wird, um die Anwendung zu beenden.

#### resources/images/icons8-menu.png

Das Menü-Symbol, das in der Menüleiste verwendet wird, um das Popup-Menü zu öffnen.

#### resources/images/icons8-next-page-48.png

Das Symbol für den Weiter-Button, der zur nächsten Seite der Anwendung führt.

#### resources/questions.json

Die JSON-Datei, die die Fragen und Antworten enthält, die auf der zweiten Seite der Anwendung angezeigt werden.

### Bibliotheken

#### libs/json-20240303.jar

Die JSON-Bibliothek, die verwendet wird, um die Fragen und Antworten aus der `questions.json` Datei zu laden.

<<<<<<< HEAD
## Kompilieren und Ausführen des Projekts

1. **Kompilieren Sie den Code:**

   Stellen Sie sicher, dass Sie sich im Verzeichnis `project` befinden, und führen Sie den folgenden Befehl aus:

   ```sh
   javac -d out -cp libs/json-20240303.jar src/com/bbq/flashcards/*.java
=======
###Kompilieren und Ausführen des Projekts
Kompilieren Sie den Code:

Stellen Sie sicher, dass Sie sich im Verzeichnis project befinden, und führen Sie den folgenden Befehl aus:

```javac -d out -cp libs/json-20240303.jar src/com/bbq/flashcards/*.java```

**Führen Sie den Code aus:**

```java -cp out;libs/json-20240303.jar com.bbq.flashcards.Main```

Diese Schritte stellen sicher, dass die JSON-Bibliothek korrekt im Klassenpfad enthalten ist und Ihre Anwendung korrekt kompiliert und ausgeführt wird.
   
## Weitere Details zur Architektur und Implementierung
In einer typischen Java-Anwendung wie der Flashcards-App gibt es mehrere Schichten und Komponenten, die zusammenarbeiten, um die Funktionalität zu gewährleisten. Hier sind einige zusätzliche Details zur Architektur und Implementierung:

Detaillierte Komponentenbeschreibung
### 1. TemplateFrame
Beschreibung: TemplateFrame ist eine abstrakte Klasse, die eine allgemeine Struktur für die Fenster der Anwendung bereitstellt. Sie enthält Methoden und Attribute, die in den spezifischen Fensterklassen (WelcomeFrame und NextPageFrame) wiederverwendet werden.
**Funktionen:**
Entfernen des Titelbalkens (setUndecorated(true)).
Festlegen von Fenster-Eigenschaften wie Größe und Schließen-Verhalten.
Erstellen und Hinzufügen einer Menüleiste und eines Hintergrundpanels.
Abstrakte Methoden addCustomContent() und createNextPageFrame(), die in den Unterklassen implementiert werden müssen.
### 2. WelcomeFrame
Beschreibung: WelcomeFrame erweitert TemplateFrame und fügt spezifische Inhalte für die Willkommensseite hinzu. Dazu gehören das Logo, der Begrüßungstext und die Überschrift.
Funktionen:
Implementierung der Methode addCustomContent() zur Hinzufügung des Logos und des Begrüßungstextes.
Implementierung der Methode createNextPageFrame(), um das nächste Fenster (NextPageFrame) zu erstellen.
### 3. NextPageFrame
Beschreibung: NextPageFrame erweitert TemplateFrame und zeigt die Fragen aus der JSON-Datei auf der zweiten Seite an.
Funktionen:
Implementierung der Methode addCustomContent() zur Hinzufügung eines Panels für den Fragetext.
Implementierung der Methode createNextPageFrame() (in diesem Fall null, da es keine weitere Seite gibt).
Methode loadQuestion(), die die Fragen aus der JSON-Datei lädt und anzeigt.
### 4. Main
Beschreibung: Main ist die Einstiegspunktklasse der Anwendung. Sie startet das Hauptfenster (WelcomeFrame).
Funktionen:
Die main() Methode verwendet SwingUtilities.invokeLater(), um die Benutzeroberfläche im Event-Dispatch-Thread zu erstellen und anzuzeigen.
### 5. Ressourcen
Beschreibung: Ressourcen wie Bilder und JSON-Dateien werden in einem separaten Verzeichnis (resources) organisiert und zur Darstellung und Datenverwaltung verwendet.
Bestandteile:
background.png: Das Hintergrundbild, das auf den verschiedenen Seiten der Anwendung verwendet wird.
icons8-close-32.png: Das Schließen-Symbol in der Menüleiste.
icons8-menu.png: Das Menü-Symbol in der Menüleiste.
icons8-next-page-48.png: Das Symbol für den Weiter-Button.
questions.json: Die JSON-Datei, die die Fragen und Antworten enthält.
### 6. Bibliotheken
Beschreibung: Externe JAR-Dateien wie json-20240303.jar bieten zusätzliche Funktionalitäten wie JSON-Verarbeitung.
Bestandteile:
json-20240303.jar: Die JSON-Bibliothek, die verwendet wird, um die Fragen und Antworten aus der questions.json Datei zu laden.
Architekturdiagramm
![image](https://github.com/user-attachments/assets/946855f7-7232-4906-ba4b-3b71c23bb568)


Anwendungsfallbeschreibung
Die Flashcards-App dient zum Lernen und Abfragen von Wissen mittels digitaler Karteikarten. Benutzer können die Anwendung starten und werden mit einer Willkommensseite begrüßt. Durch Klicken auf einen Weiter-Button gelangen sie zur nächsten Seite, auf der Fragen aus einer JSON-Datei angezeigt werden.


>>>>>>> 9077b44 (Add Codemagic CI/CD config , Gradle, README)
