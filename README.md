# Abschlussprojekt



Dieses Projekt implementiert ein einfaches Kampfspiel in Kotlin, bei dem Helden und Krieger in einem rundenbasierten System gegen Endgegner und Unterbosse antreten.

## Klassen

### Charakter

Die `Charakter`-Klasse repräsentiert die Basis für alle Charaktere im Spiel. Sie enthält Attribute wie `name`, `hp` (Lebenspunkte), `aktionen` (Liste von Aktionen), `grundschaden`, `schnelligkeit` und `ruestung`.

### Aktion

Die `Aktion`-Klasse beschreibt eine mögliche Handlung eines Charakters. Sie enthält Attribute wie `name`, `schaden` und `beschreibung`.

### Held

Die `Held`-Klasse ist eine abgeleitete Klasse von `Charakter` und stellt einen Helden dar. Sie enthält spezifische Aktionen und Attribute für Helden.

### Krieger

Die `Krieger`-Klasse ist eine abgeleitete Klasse von `Charakter` und stellt einen Krieger dar. Sie enthält spezifische Aktionen und Attribute für Krieger.

### HeldMagier

Die `HeldMagier`-Klasse ist eine abgeleitete Klasse von `Held` und stellt einen magischen Helden dar. Sie enthält spezifische Aktionen und Attribute für magische Helden.

### HeldKrieger

Die `HeldKrieger`-Klasse ist eine abgeleitete Klasse von `Held` und stellt einen kriegerischen Helden dar. Sie enthält spezifische Aktionen und Attribute für kriegerische Helden.

### Beutel

Die `Beutel`-Klasse repräsentiert den Beutel eines Charakters mit Heiltränken und Vitaminen. Sie enthält Attribute wie `heiltrankAnzahl` und `vitamineAnzahl`.

### Endgegner

Die `Endgegner`-Klasse ist eine abgeleitete Klasse von `Charakter` und stellt einen mächtigen Gegner dar. Sie enthält spezifische Aktionen und Attribute für Endgegner.

### Unterboss

Die `Unterboss`-Klasse ist eine abgeleitete Klasse von `Charakter` und stellt einen besonders starken Gegner dar. Sie enthält spezifische Aktionen und Attribute für Unterbosse.

## Funktionen

### kampf()

Die `kampf()`-Funktion simuliert einen Kampf zwischen zwei Charakteren. Sie verwendet `berechneSchaden()`, `handleSchaden()`, `istKampfVorbei()` und `ermitteleGewinner()`.

### berechneSchaden()

Die `berechneSchaden()`-Funktion berechnet den Schaden, den eine Aktion verursacht.

### handleSchaden()

Die `handleSchaden()`-Funktion behandelt den erlittenen Schaden und aktualisiert die Lebenspunkte der Charaktere.

### istKampfVorbei()

Die `istKampfVorbei()`-Funktion überprüft, ob der Kampf vorbei ist, indem sie prüft, ob alle Charaktere tot sind.

### ermitteleGewinner()

Die `ermitteleGewinner()`-Funktion bestimmt den Gewinner des Kampfes.

## Anwendung

Die Anwendung findet sich in der `main()`-Funktion, wo Instanzen von Charakteren, Aktionen und Gegnern erstellt werden. Der Kampf wird gestartet und in Runden durchgeführt, bis ein Gewinner ermittelt wird.

## Erweiterungen

Das Projekt kann durch die Implementierung von zufälligen Aktionen, Heilung, Effekten, einer grafischen Benutzeroberfläche und Persistenz weiter verbessert werden.















