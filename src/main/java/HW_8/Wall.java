package HW_8;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void obstaclePass(Action a) {
        a.jump(height);
    }
}
