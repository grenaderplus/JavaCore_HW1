package HW_4;

import java.util.Random;
import java.util.Scanner;

public class HW_4 {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isLineWIn(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Ты победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (isLineWIn(DOT_O, DOTS_TO_WIN)) {
                System.out.println("Ты проиграл!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
//        if (map[y][x] == DOT_EMPTY) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isLineValid(int y, int x, int cy, int cx, char dot, int dotsToWin) {
        if (y + cy * (dotsToWin - 1) > SIZE - 1 || x + cx * (dotsToWin - 1) > SIZE - 1 || y + cy * (dotsToWin - 1) < 0) {
            return false;
        }
        for (int i = 0; i < dotsToWin; i++) {
            if (map[y + i * cy][x + i * cx] != dot) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLineWIn(char dot, int dotsToWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (
                        isLineValid(i, j, 0, 1, dot, dotsToWin) ||
                                isLineValid(i, j, 1, 0, dot, dotsToWin) ||
                                isLineValid(i, j, 1, 1, dot, dotsToWin) ||
                                isLineValid(i, j, -1, 1, dot, dotsToWin)
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
