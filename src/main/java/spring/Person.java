package spring;

public class Person {
    private Pet pet;
private String surname;
private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person sey age");
        this.age = age;
    }

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
