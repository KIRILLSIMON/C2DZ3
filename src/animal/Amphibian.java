package animal;

public class Amphibian extends Animal{

    public Amphibian(String name, int age, String environment) {
        super(name, age, environment);
    }

    public void hunt(){
        System.out.println("Земноводное охотиться рядом с водой");
    }
    @Override
    public void eat() {
        System.out.println("Земноводное питается БУКАШКАМИ");
    }

    @Override
    public void go() {
        System.out.println("Земноводное по ВОДЕ шляется!");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит ночью");
    }}
