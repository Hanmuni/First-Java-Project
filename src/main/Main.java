import Arrays.ObjectArray;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObjectArray<String> strings = new ObjectArray<>();
        strings.add("Montag");
        strings.add("Dienstag");

        ObjectArray<Integer> integers = new ObjectArray<>();
        integers.add(5);
        integers.add(15);

        ObjectArray<Double> doubles = new ObjectArray<>(10);
        doubles.add(10.0);
        doubles.add(20.0);

        List<Integer> numbers = new ArrayList<>(10);
        numbers.add(5);
        numbers.add(15);
    }
}