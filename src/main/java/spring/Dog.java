package spring;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void  say (){
        System.out.println("BoW - WoW");
    }
    public void  init(){
        System.out.println("Class Dog^ init method");
    }
    public void destroy (){
        System.out.println("Class Dog^ Destroy ");
    }
}
