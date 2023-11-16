# Abschlussprojekt


#Ein einfaches Kampfspiel in Kotlin
#Dieses Spiel simuliert einen Kampf zwischen zwei Teams von Helden und Kriegern.

#Klassen
Charakter ist die Basisklasse für alle Charaktere im Spiel. Sie enthält die folgenden Attribute:

-name: Der Name des Charakters

-hp: Die Lebenspunkte des Charakters

-aktionen: Eine Liste von Aktionen, die der Charakter ausführen kann

-grundschaden: Der Grundschaden des Charakters

-schnelligkeit: Die Geschwindigkeit des Charakters

-ruestung: Die Rüstung des Charakters

#Held und Krieger sind abgeleitete Klassen von Charakter. Sie unterscheiden sich in ihren Grundwerten und Aktionen.

#Aktion ist eine Klasse, die eine Aktion eines Charakters beschreibt. Sie enthält die folgenden Attribute:

-name: Der Name der Aktion

-schaden: Der Schaden, den die Aktion verursacht

-beschreibung: Eine Beschreibung der Aktion

-Beutel ist eine Klasse, die einen Beutel mit Heiltränken und Vitaminen enthält. Sie enthält die folgenden Attribute:

-heiltrankAnzahl: Die Anzahl der Heiltränke im Beutel

-vitamineAnzahl: Die Anzahl der Vitamine im Beutel

-Unterboss ist eine Klasse, die einen Unterboss beschreibt. Sie ist eine abgeleitete Klasse von Aktion.

#Funktionen
kampf() simuliert einen Kampf zwischen zwei Charakteren.

-berechneSchaden() berechnet den Schaden, den eine Aktion verursacht.

-handleSchaden() behandelt den Schaden, der einem Charakter zugefügt wurde.

-istKampfVorbei() überprüft, ob ein Kampf vorbei ist.

-sindAlleTot() überprüft, ob alle Charaktere in einer Gruppe tot sind.

-ermitteleGewinner() ermittelt den Gewinner eines Kampfes.
