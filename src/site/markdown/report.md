# 19-Abgabe04-Buraczewska-Schreyer #



## LAB - REPORT ##

**Abgabe**: 04

**Teammitglieder**:

- Diana Buraczewska
- Lukas Schreyer

**Repository**: <https://github.com/Schreyer/19-Abgabe04-Buraczewska-Schreyer>



## Vorgehensweise ##

1. **Projekt einrichten**:

   Zuerst wurde ein Repository auf GitHub erstellt, auf dem das Projekt bearbeitet wird. Anschließend wurde die Queue-Vorlage übernommen und als Maven-Projekt hinzugefügt. Dabei wurde die pom.xml mit allen für das Projekt erforderlichen Inhalten erstellt. Weiters wurde ein .gitignore File erstellt, um generierte Dateien nicht auf das Repository zu laden. Auf GitHub wurde die Taskliste in das readme-File übertragen.

2. **Fehler im Code finden und korrigieren:**

   Der Code wurde genau begutachtet und dabei sind folgende vier Fehler gefunden und wie folgt verbessert worden:

   ### Erster Fehler: ###

Übergabeparameter ist falsch geschrieben:

```java
public StringQueue(int maxsize){
    maxSize = maxSize;
}
```

Zuweisung muss geändert werden:

```java
public StringQueue(int maxSize){
    this.maxSize = maxSize;
}
```



### 	Zweiter Fehler: ###

If- Abfrage kann nie "true" werden:

```java
public String remove() {
    String element = poll();
    element = "";
    if(element == null)
        throw new NoSuchElementException("there's no element any more");

    return element;
}
```

Zuweisung muss gelöscht werden:

```java
public String remove() {
    String element = poll();
    if(element == null)
        throw new NoSuchElementException("there's no element any more");

    return element;
}
```



### 	Dritter Fehler: ###

Initialisierung der Variable ist redundant:

```java
private int maxSize = 5;
```

Zuweisung kann entfernt werden:

```java
private int maxSize ;
```



### 	Vierter Fehler: ###

If- Bedingung ist falsch.

```java
public String poll() {
    String element = peek();

    if(elements.size() == 0){
        elements.remove(0);
    }

    return element;
}
```

Abfrage muss auf "größer" geändert werden:

```java
public String poll() {
    String element = peek();

    if(elements.size() > 0){
        elements.remove(0);
    }

    return element;
}
```

​	

3. **JavaDoc erzeugen:**

   Es wurde jede Methode und jede Klasse in der StringQueue.java und in der TestStringQueue.java Klasse mittels JavaDoc Kommentar beschrieben. Danach konnte automatisch die JavaDoc Dokumentation über das Projekt erstellt werden. Das geht entweder über die IDE oder mit maven site.

   ![](D:\Dateien Lukas\Studium\Semester 2\Konfigurationsmanagment\19-Abgabe04-Buraczewska-Schreyer\src\site\media\JavaDoc1.PNG)

   JavaDoc Kommentare macht man mit:

   ```java
   /**
    * So erstellt man JavaDoc Kommentare
    */
   ```

4. **Junit Tests erstellen:**

   Es wurden mehrere Jnuit Test erstellt, um das gesamte Projekt überprüfen zu können. Mit der Funktion "Coverage" konnte kontrolliert werden, ob der gesamte Code getestet wurde. Wie zuvor schon erwähnt, wurde auch hier jede Klasse und jede Methode mittels JavaDoc dokumentiert.

   ![](/../src/site/media/Junit Tests.PNG)

5. **pom.xml anpassen:**

   Um das Projekt mittels Maven erstellen zu können, müssen einige Plugins und Dependencies erstellet werden. Diese wurden bereits am Anfang des Projekts hinzugefügt. Des weiteren wurden auch Inhalte hinzugefügt, um die Dokumentation zu generieren.

   <u>Folgende Inhalte wurden zu Beginn hinzugefügt:</u>

   - **Developer Informationen**
   - **Plugins**
     - maven-compiler-plugin
     - maven-site-plugin
     - maven-project-info-reports-plugin
     - maven-javadoc-plugin
     - maven-site-plugin
     - maven-project-info-reports-plugin
   - **Dependencies**
     - junit
     - log4j-api
     - log4j-core
   - **Reporting**
     - maven-javadoc-plugin
     - maven-surefire-report-plugin

   6. **Log4j integrieren und in jeder Methode ins Log schreiben:**

      Zuerst wurde ein log4j2.properties-File erzeugt, das die Konfigurationen, wie etwa wo die Logs hingeschrieben werden sollen, definiert. Dann konnte in jeder Klasse ein statischer Logger und bei jeder Methode Info-Lognachrichten erstellt werden. Des weiteren wurde bei Exceptions eine Error-Lognachricht erzeugt. Diese Lognachrichten wurden alle in der Konsole ausgegeben.

      ![](/../src/site/media/logging1.PNG)

      ![](/../src/site/media/logging2.PNG)

7. **Maven Site Dokumentation erstellen:**

   Um nun das Projekt abzuschließen, wurde eine Maven Site Dokumenation erstelt. Diese Dokumentation wird automatisch generiert und beinhaltet in diesem Fall eine Allgemeine Beschreibung des Projektes, alle Dependencies, die Ergebnisse der Junit Tests und die JavaDoc Kommentare.
   Dazu wurde eine site.xml erzeugt, die angibt, welche Seiten dazugehören. In diesem Fall wurde noch eine Projektbeschreibung und dieser Lab-Report hinzugefügt. Diese Seiten wurden im Ordner Site gespeichert.

   ![](/../src/site/media/Maven Site.PNG)

8. **Lab-Report erstellen:**

   Zum Schluss wurde dieser Report über das gesamte Projekt erstellt. Es wurden alle Schritte beschrieben oder mit Screenshots veranschaulicht. 

   **Übung GitHub Flavor:**

   - Python Code:

     ```python
     stuff = ["Hello, World!", "Hi there, Everyone!", 6]
     for i in stuff:
         print(i)
     ```

   - Java Code:

     ```java
     public class Test {
         public static void main(String args[]) {
             String array[] = {"Hello, World", "Hi there, Everyone", "6"};
             for (String i : array) {
               System.out.println(i);
             }
         }
     }
     ```

9. **Auf Vollstädnigkeit Prüfen:**

   Vor der Abgabe wurde das gesamte Projekt auf Vollständigkeit geprüft.

10. **Bericht in PDF umwandeln:**

    Der Berichte und alle .md-Files wurden mit dem Typora Editor erstellt. Mit diesem wurde dann auch die PDF Datei erstellt.



## LINKS/ LITERATUR ##

- <https://maven.apache.org/>
- <https://maven.apache.org/guides/mini/guide-site.html>
- <https://maven.apache.org/plugins/maven-site-plugin/usage.html>
- <https://docs.gitignore.io/>
- <https://logging.apache.org/log4j/2.x/>
- https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html