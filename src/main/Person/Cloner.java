package Person;

import java.util.ArrayList;
import java.util.List;

public class Cloner<T> {

    public List<T> shallowClone(T original, int copyNumber) {
        // Leere Liste, um die Kopien zu speichern
        List<T> copies = new ArrayList<>();

        // for - Schleife für Anzahl der gewünschten Kopien
        for (int i = 0; i < copyNumber; i++) {
            copies.add(original);
        }

        // Gib die Liste der Kopien zurück
        return copies;
    }
}
