public class App {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myCat.eat();
        myDog.eat();
        myCat.sleep();
        myDog.sleep();
        myCat.makeSound();
        myDog.makeSound();
    }
}
