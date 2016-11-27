package Animal;

public class Dog extends Animal{

    public Dog(){
        super(15);
        System.out.println("A dog has been created.");
    }

    public void ruff (){
        System.out.println("The dog says ruff");
    }

    public void sleep () {
        System.out.println("A dog is sleeping");
    }
    public void run(){
        System.out.println("A dog is running");
    }

}
