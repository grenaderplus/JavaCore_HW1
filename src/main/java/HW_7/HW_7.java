package HW_7;

public class HW_7 {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Tank", 23),
                new Cat("Oleo", 15),
                new Cat("Phlippe", 19),
                new Cat("Walles", 12)
        };

        Plate plate = new Plate(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].printStarvingStatus();
        }
        System.out.println(plate);

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getStarvingStatus() == true) {
                System.out.println("Plate refilling...");
                plate.refillFood();
                System.out.println(plate);
            }
        }

    }
}
