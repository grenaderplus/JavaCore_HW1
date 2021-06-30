package HW_3;

import java.util.Random;
import java.util.Scanner;

public class HW_3 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Привет! \nДавай сыграем в игру 'Угадай число'. \nЯ загадываю число от 0 до 9, а ты угадываешь. \nУ тебя 3 попытки. \nПоехали!");
        guessNumber();
    }

    static void guessNumber() {
        int answer = random.nextInt(9);
        int userAnswer;
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.println("Какое число я загадал?");
            userAnswer = sc.nextInt();
            if (userAnswer == answer) {
                System.out.println("Ты выиграл...На этот раз. \nСыграем еще раз? \n1 - ДА \n0 - НЕТ");
                int gameContinue = sc.nextInt();
                if (gameContinue == 0) {
                    System.out.println("Спасибо за игру!");
                    break;
                } else {
                    i = 0;
                    answer = random.nextInt(9);
                    continue;
                }
            } else if (userAnswer < answer) {
                System.out.println("Неверное число. Я загадал большее число.");
                if (i == (count - 1)) {
                    System.out.println("Ха-ха-ха, ты проиграл!");
                    break;
                }
            } else if (userAnswer > answer) {
                System.out.println("Неверное число. Я загадал меньшее число.");
                if (i == (count - 1)) {
                    System.out.println("Ха-ха-ха, ты проиграл!");
                    break;
                }
            }
        }
    }
}
