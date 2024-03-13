package Arrays;

public class ObjectArray<T> {
    private T[] array;
    private int count;

    public ObjectArray() {
        array = (T[]) new Object[10];
        count = 0;
    }
    public ObjectArray(int size) {
        array = (T[]) new Object[size];
        count = 0;
    }

    // add Methode
    public void add(T element) {
        //Überprüfe ob genügen Plätze im Array frei sind
        if (this.count >= array.length) { // If Zähler größer als Array
            T[] newArray = (T[]) new Object[array.length * 2]; // neues Array mit doppelter Kapazität

            for (int i = 0; i < array.length; i++) {
                newArray[i] = this.array[i]; // kopiere alte Werte in neues Array
            }
            array = newArray; //Überschreiben altes in neues Array

        }
        array[count] = element;
        count++; // Element 1 mal hinzufügen

    }

    // get Methode
    public T get(int index) {
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
