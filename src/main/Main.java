import Annotations.CSVParser;
import Annotations.Movie;
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

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Dune", "Denis Villeneuve", "Science-Fiction", 165000000, 2021, 430000000));
        movies.add(new Movie("Kill Bill", "Quentin Tarantino", "Action", 30000000, 2003, 180949000));
        movies.add(new Movie("When Harry Met Sally...", "Rob Reiner", "Romantic Comedy", 16000000, 1989, 92820000));


        CSVParser<Movie> csvParser = new CSVParser<>(Movie.class);

        String result = csvParser.parse(movies);
        System.out.println(result);

    }
}