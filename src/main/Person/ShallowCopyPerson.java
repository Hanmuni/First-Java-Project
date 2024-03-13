package Person;


import java.util.List;

public class ShallowCopyPerson {
        public static void main(String[] args) {
            // Originalperson
            Person original = new Person(21, "John", "Smith", 1.88, 90);

            // 5 Klone
            List<Person> copies = new Cloner().shallowClone(original, 5);


            System.out.println(copies.get(0).getFirstname());

            // Gibt alle Kopien in der Konsole aus
//            System.out.println("Original: " + original);
//            System.out.println("Klon 1: " + copies.get(0));
//            System.out.println("Klon 2: " + copies.get(1));
//            System.out.println("Klon 3: " + copies.get(2));
//            System.out.println("Klon 4: " + copies.get(3));
//            System.out.println("Klon 5: " + copies.get(4));
        }
    }

