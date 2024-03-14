package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Animal {
    private String name;
    private Integer age;
    private Integer weight;
    private Integer numberOfLegs;

    public Animal(String name, Integer age, Integer weight, Integer numberOfLegs) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    // for Loop Methoden
    public static List<Animal> filterTwoLegsLoop(List<Animal> animals) {
        List<Animal> filteredList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getNumberOfLegs() == 2) {
                filteredList.add(animal);
            }
        }
        return filteredList;
    }

    public static List<Animal> filterOverAgeTenLoop(List<Animal> animals) {
        List<Animal> filteredList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getAge() > 10) {
                filteredList.add(animal);
            }
        }
        return filteredList;
    }
    public static List<Animal> filterBetweenFiveandEightLoop(List<Animal> animals) {
        List<Animal> filteredList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getAge() >= 5 && animal.getAge() <= 8) {
                filteredList.add(animal);
            }
        }
        return filteredList;
    }

    // Stream Methode
    public static List<Animal> filterTwoLegsStream(List<Animal> animals) {
        return animals.stream().filter(animal -> animal.getNumberOfLegs() == 2).collect(Collectors.toList());
    }

    public static List<Animal> filterOverAgeTenStream(List<Animal> animals) {
        return animals.stream().filter(animal -> animal.getAge() > 10).collect(Collectors.toList());
    }

    public static List<Animal> filterBetweenFiveandEightStream(List<Animal> animals) {
        return animals.stream().filter(animal -> animal.getAge() >= 5 && animal.getAge() <= 8).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
