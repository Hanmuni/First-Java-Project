package Person;

import java.util.Comparator;
import java.util.Objects;

public class Person extends CloneableObject implements Comparable<Person> {

    private Integer age;
    private String firstname;
    private String lastname;
    private Double height;
    private Integer weight;

    public Person(Integer age, String firstname, String lastname, Double height, Integer weight) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age) && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(height, person.height) && Objects.equals(weight, person.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstname, lastname, height, weight);
    }

    @Override
    public int compareTo(Person otherPerson) {
        int ageComparison = this.age.compareTo(otherPerson.age);
        double heightComparison = this.height.compareTo(otherPerson.height);

        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return Double.compare(heightComparison, 0);
        }
    }

    public static Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
    public static Comparator<Person> heightComparator = Comparator.comparing(Person::getHeight);


}
