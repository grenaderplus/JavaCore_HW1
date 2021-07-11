package HW_6;

public class HW_6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tank","Brown",2,200,0);
        Cat cat2 = new Cat("Dori","Red",5,150,0);
        Cat cat3 = new Cat("Vanilla","White",3,175,0);

        Dog dog1 = new Dog("Rody","Black",7,500,10);
        Dog dog2 = new Dog("Phil","Brown",10,450,10);
        Dog dog3 = new Dog("Max","Grey",5,600,12);

        cat1.info();
        cat2.info();
        cat3.info();

        dog1.info();
        dog2.info();
        dog3.info();

        cat1.run(100);
        cat1.swim(10);
        cat2.run(100);
        cat2.swim(10);
        cat3.run(150);
        cat3.swim(75);
        dog1.run(1000);
        dog1.swim(5);
        dog2.run(410);
        dog2.swim(5);
        dog3.run(500);
        dog3.swim(10);
    }
}
