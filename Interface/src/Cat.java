public class Cat implements Animal {

    public void eat() {
        System.out.print("My cat eats fish \t\t - \t");
    }

    public void sleep() {
        System.out.print("\nMy cat sleeps under the chair\t - \t");
    }

    public void makeSound() {
        System.out.print("\nCats sound is 'Meow'\t - \t");
    }

    @Override
    public String toString() {
        return "";
    }
}
