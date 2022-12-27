package animal;

public class Predator extends Mammal{
    public Predator(String name,
                    int age,
                    String environment,
                    int speed,
                    String food) {
        super(name, age, environment, speed, food);}

    public void hunt(){
        System.out.println("Хищник охотиться");
    }

    @Override
    public void eat() {
        System.out.println("Хищник жрёт ПЛОТЬ!"+getFood());
    }

    @Override
    public void go() {
        System.out.println("Хищник ВСЮДУ шляется!");
    }

    @Override
    public void sleep() {
        System.out.println("Хищник дрыхнет после ЗАГРЫЗАНИЯ(и ДНЁМ, и НОЧЬЮ)");
    }

    @Override
    public void walk() {
        System.out.println("Хищник гуляет ВСЕГДА РЯДОМ С ЖЕРТВОЙ");
    }
}
