import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by PavlovAN on 22.11.2016.
 */
public class Game {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Угадай число");
        for (int i = 10; i <= 30; i += 10) plyLevel(i);
        System.out.println("Win");
    }

        private static void plyLevel (int range) {
            int number = (int) (Math.random() * range);
            while (true) {
                System.out.println("В dеди число от 0 до" + range);
                {
                    int inputNamber = scanner.nextInt();
                    if (inputNamber == number) {
                        System.out.println("Выугодали");
                        break;
                    } else if (inputNamber < number) {
                        System.out.println("Вы проиграли заданное  число больше");
                    } else {
                        System.out.println("Вы проиграли заданное  число Меньше");
                    }
                }
            }
        }
//        while (true) {
//            System.out.println("В dеди число от 0 до" + range);
//            try {
//                int inputNamber = scanner.nextInt();
//
//                if (inputNamber == number) {
//                    System.out.println("Выугодали");
//                    break;
//                } else if (inputNamber < number) {
//                    System.out.println("Вы проиграли заданное  число больше");
//                } else {
//                    System.out.println("Вы проиграли заданное  число Меньше");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("ВВоди только цыфры");
//                break;
//            }
//        }
    }



