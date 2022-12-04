# Advent-of-Code

Day 1: Excel
- Input in Excel-Tabelle eingefügt
- Zweite Spalte nebendran für Elfen mit Formel =IF(A2;B2;B2+1) ab B3
- Formel auf alle unteren Zellen angewendet um in Gruppen zu teilen
- In Pivot-Tabelle umgewandelt/erstellt 
- Gruppen nach Calorie-Summe sortiert
Part 2:
- 3 höchsten Summen addiert


Day 2: Java
- Alle möglichen Punktekombinationen in Excel gerechnet
- In Java Scanner um die Datei zu lesen
- Alle Leerzeichen entfernt damit "AX" statt "A X"
- If-else mit jeder Kombination für passende Punktzahl
Part 2: Dasselbe mit angepassten Werten

Day 3: Java
- Scanner liest input ein
- Wandelt den String in ein Array aus Charactern
- Kopiert die erste Häflte des Arrays in ein Neues
- Macht mit substring einen zweiten String mit der übrigen zweiten Hälfte
- for-Schelife für jeden Character im Array
- Prüft den Index des Characters im zweiten Halbstring -> wenn nicht vorhanden dann Bedingung nicht erfüllt
- Wenn Kleinbuchstabe wird der Wert um den umgewandelten Wert erhöht
- Wenn Großbuchstabe dann noch +58 dazu
Part 2:
- Scanner liest die nächsten 3 Zeilen
- Erstellt ein Array aus char mit dem ersten String
- for-Schleife für jedes Element aus dem erstellten Array
- genestete If-Abfrage ob die zweite Zeile das Element hat; danach ob die dritte Zeile das Element hat
- If-Abfrage für Groß-Kleinschreibung mit Formel aus Part 1

Day 4: Java
- Scanner liest Zeile des Inputs ein
- mit Regex alle (-) mit (,) ersetzt
- Den String an den (,) gesplittet und ein String Array erstellt
- Zweites Array aus Integers mit der selben Länge wie das andere Array erstellt
- mit For-Loop den Inhalt des String-Arrays in Integers umgewandelt und in das Integer Array kopiert
- If-Abfrage für Überschneidungen
Part 2:
-Dasselbe mit angepassten If-Abfragen
