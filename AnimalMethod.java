/*Write a Java program to create an abstract class Animal with abstract 
 * methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer, 
 * that extends the Animal class and implement the eat() and sleep()
 * methods differently based on the specific behavior 
 */

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("The lion eats");
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleeps zzzz");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("The tiger eats");
    }

    @Override
    public void sleep() {
        System.out.println("The tiger sleeps zzzz");
    }
}

class Deer extends Animal { 
    @Override
    public void eat() {
        System.out.println("The deer eats");
    }

    @Override
    public void sleep() {
        System.out.println("The deer sleeps zzzz");
    }
}

public class AnimalMethod {
    public static void main(String[] args) {
        
        Animal tiger = new Tiger();
        Animal deer = new Deer();
        Animal lion = new Lion();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();

        lion.eat();
        lion.sleep();
    }
}