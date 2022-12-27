package animal;

public class FlyingBird extends Bird{private String movement;

    public FlyingBird(String name, int age,
                      String environment,
                      String movement) {
        super(name, age, environment,movement);

    }

    @Override
    public void eat() {
        System.out.println("Летающая птица ест на земле или в воздухе");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица передвигается по "+getMovement());
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит ночью или днём");
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотиться на земле или в воздухе");

    }
}
