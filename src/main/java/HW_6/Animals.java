package HW_6;

public class Animals {
    protected String name;
    protected String color;
    protected int age;
    protected int maxRunDist;
    protected int maxSwimDist;

    public Animals(String name, String color, int age, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    public void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.printf("%s пробежал %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("%s не может осилить эту преграду, %s может пробежать за раз %d метров\n", name, name, maxRunDist);
        }
    }

    public void swim(int dist) {
        if (dist <= maxSwimDist) {
            System.out.printf("%s проплыл %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("%s не может осилить эту преграду, %s может проплыть за раз %d метров", name, name, maxSwimDist);
        }
    }
}
