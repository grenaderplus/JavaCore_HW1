package HW_8;

public interface Action {

    void run(int distance);

    void jump(int height);

    boolean actionCheck();

    void info();
}
