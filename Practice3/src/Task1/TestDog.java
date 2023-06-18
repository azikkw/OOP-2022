package Task1;

public class TestDog
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Dog d = new Dog();

        Dog d1 = new Dog("Ruby", 2, Gender.MALE, "Husky");
        Dog d2 = new Dog("Cheri", 4, Gender.FEMALE, "Akita");
        Dog d3 = new Dog("Luk", 2, Gender.MALE, "Bulldog");
        Dog d4 = new Dog("Lady", 1, Gender.FEMALE, "Doberman");
        Dog d5 = new Dog("Gaga", 6, Gender.FEMALE, "Dalmatian");
        Dog d6 = new Dog("Axel", 3, Gender.MALE, "German shepherd");

        for(Dog cur: Dog.dogsList) {
            System.out.println(cur);
        }

        System.out.println();

        System.out.println("Sum of ages: " + d.sumOfAge(2, 3));
        System.out.println("Sum of ages: " + d.sumOfAge(1, 5, 4));

        System.out.println();

        d.voice();
    }
}
