package animal;

public class Herbivore extends Mammal{
    public Herbivore(String name,
                     int age,
                     String environment, int speed, String food) {
        super(name, age,
                environment,
                speed, food);
    }

    public void graze(){
        System.out.println("Травоядное пасётся");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное питается"+getFood());

    }

    @Override
    public void go() {
        System.out.println("Травоядное ходит по траве");
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью");

    }

    @Override
    public void walk() {
        System.out.println("Травоядное гуляет по траве");
    }
}
