package HW_8;

public class Road implements Obstacle {

    private int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public void obstaclePass(Action a) {
        a.run(distance);
    }
}
