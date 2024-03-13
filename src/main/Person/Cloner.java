package Person;

import java.util.ArrayList;
import java.util.List;

public class Cloner {
    public static List<Person> shallowClonePerson(Person original, int copyNumber) {
        // Leere Liste, um die Kopien zu speichern
        List<Person> copies = new ArrayList<>();

        // for - Schleife für Anzahl der gewünschten Kopien
        for (int i = 0; i < copyNumber; i++) {
            try {
                // Kopie wird erstellt
                copies.add((Person) original.clone());
            } catch (CloneNotSupportedException e) {
                // Fehlermeldung wenn Klonen nicht funktioniert
                e.printStackTrace();
            }
        }

        // Gib die Liste der Kopien zurück
        return copies;
    }
}
