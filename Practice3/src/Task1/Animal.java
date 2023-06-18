package Task1;

public class Animal
{
    String name;

    int age;

    Gender gender;

    public Animal() {}

    public Animal(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void voice() {
        System.out.println("Some voice");
    }

    public String toString() {
        return name + ", " + age + ", " + gender;
    }
}
