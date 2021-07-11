package HW_6;

public class Cat extends Animals {

    public Cat(String name, String color, int age, int maxRunDist, int maxSwimDist) {
        super(name, color, age, maxRunDist, maxSwimDist);
    }

    public void info() {
        System.out.printf("Кот %s, цвет - %s, возраст - %d\n", name, color, age);
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDist) {
            System.out.printf("%s проплыл %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("К сожалению, коты не умеют плавать\n", name);
        }
    }
}
