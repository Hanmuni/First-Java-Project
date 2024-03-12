package Arrays;

public class IntArray {
    private int[] array;
    private int count;

    public IntArray(int size) {
        array = new int[size];
        count = 0;
    }

    // add Methode
    public void add(int element) {
        //Überprüfe ob genügen Plätze im Array frei sind
        if (this.count >= array.length) { // If Zähler größer als Array
            int[] newArray = new int[array.length * 2]; // neues Array mit doppelter Kapazität

            for (int i = 0; i < array.length; i++) {
                newArray[i] = this.array[i]; // kopiere alte Werte in neues Array
            }
            array = newArray; //Überschreiben altes in neues Array

        }
        array[count] = element;
        count++; // Element 1 mal hinzufügen

    }

    // get Methode
    public int getIndex(int index) {
        return array[index];
    }

    // getArraySize Methode
    public int getArraySize() {
        return array.length;
    }

    // getElementCount Methode
    public int getElementCount() {
        return count;
    }

}
