# Flashcards App

Dies ist eine Java-Anwendung, die eine Flashcards-App implementiert. Die Anwendung zeigt eine Willkommensseite mit einem Hintergrundbild und einem Button zum Weiterblättern. Sie lädt Fragen aus einer JSON-Datei, die auf der zweiten Seite angezeigt werden.

## Projektübersicht

Das Projekt ist als Paket entwickelt und besteht aus folgenden Dateien und Ressourcen:

### Paketstruktur

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

## Kompilieren und Ausführen des Projekts

1. **Kompilieren Sie den Code:**

   Stellen Sie sicher, dass Sie sich im Verzeichnis `project` befinden, und führen Sie den folgenden Befehl aus:

   ```sh
   javac -d out -cp libs/json-20240303.jar src/com/bbq/flashcards/*.java
