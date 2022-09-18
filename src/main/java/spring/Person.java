package spring;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");

    }

    public void setPet(Pet pet) {
        System.out.println("Class person Set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my Lovely Pet");
        pet.say();
    }
}
