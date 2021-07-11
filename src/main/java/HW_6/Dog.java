package HW_6;

public class Dog extends Animals {

    public Dog (String name, String color, int age, int maxRunDist, int maxSwimDist) {
        super(name, color, age, maxRunDist, maxSwimDist);
    }

    public void info() {
        System.out.printf("Пёс %s, цвет - %s, возраст - %d\n", name, color, age);
    }
}
