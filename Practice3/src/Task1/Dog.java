package Task1;

import java.util.Vector;

public class Dog extends Animal
{
    String breed;

    //Owner owner;

    static Vector <Dog> dogsList;

    static {
        dogsList = new Vector <Dog>();
    }
    {
        dogsList.add(this);
    }

    public Dog() {
        super();
    }

    public Dog(String name, int age, Gender gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
        //this.owner = owner;
    }

    //public void hasOwnerOrNot() {
        //for(int i = 0; i < dogsList.size(); i++) {
            //if(dogsList.get(i).owner == Owner.YES) {
                //System.out.println("Dog: " + dogsList.get(i).name + ", " +
                                    //dogsList.get(i).age + ", " +
                                    //dogsList.get(i).gender + ", " +
                                    //dogsList.get(i).breed);
            //}
        //}
    //}

    // Overloading
    public int sumOfAge(int a1, int a2) {
        return a1 + a2;
    }
    public int sumOfAge(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    public void voice() {
        System.out.println("Gav-gav");
    }

    public String toString() {
        return "Dog: " + super.toString() + ", " + breed; //"\nHas owner? - " + owner;
    }
}
