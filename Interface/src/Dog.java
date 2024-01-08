public class Dog implements Animal {

    public void eat() {
        System.out.print("My dog eats meat ");

    }

    public void sleep() {
        System.out.print("My dog sleeps under the table ");
    }

    public void makeSound() {
        System.out.print("Dogs sound is 'bark'");

    }

    @Override
    public String toString() {
        return "";
    }
}
