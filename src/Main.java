import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(12);
        System.out.println("Выберите фигуру:");
        System.out.println("1. Цилиндр: ");
        System.out.println("2. Сфера: ");
        System.out.println("3. Пирамида:");
        boolean result;
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        switch (number) {
            case 1:
                Cyliinder cyliinder = new Cyliinder(15,58);
                result = box.add(cyliinder);
                System.out.println(result);
                break;
            case 2:
                Ball ball = new Ball(15);
                 result = box.add(ball);
                System.out.println(result);
                break;
            case 3:
                Pyramid pyramid = new Pyramid(15,51);
                result = box.add(pyramid);
                System.out.println(result);
                break;

        }

    }
}