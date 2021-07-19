package HW_8;

public class Robot implements Action {

    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean actionCheck;

    public Robot (String name, int maxRunDistance, int maxJumpHeight, boolean actionCheck) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.actionCheck = true;
    }

    public Robot (String name) {
        this(name,10000,10,true);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("%s пробежал %d метров\n",name,distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров и сошел с дистанции\n",name,distance);
            actionCheck = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s прыгнул на %d метров\n",name,height);
        } else {
            System.out.printf("%s не смог прыгнуть на %d метров и сошел с дистанции\n",name,height);
            actionCheck = false;
        }
    }

    @Override
    public boolean actionCheck() {
        return actionCheck;
    }

    @Override
    public void info() {
        System.out.printf("%s %b\n",name,actionCheck);
    }
}
