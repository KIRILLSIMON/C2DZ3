package animal;

public class NonFlyingBird extends Bird{
    private String movement;

    public NonFlyingBird(String name, int age,
                         String environment,
                         String movement) {
        super(name, age, environment,movement);

    }

    @Override
    public void eat() {
        System.out.println("НЕлетающая птица ест на земле");
    }

    @Override
    public void go() {
        System.out.println("НЕлетающая птица передвигается по "+getMovement());
    }

    @Override
    public void sleep() {
        System.out.println("НЕлетающая птица спит ночью");
    }

    @Override
    public void hunt() {
        System.out.println("НЕлетающая птица охотиться на земле");

    }}
