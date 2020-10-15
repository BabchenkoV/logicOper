package main;

public class LernDebug {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("task1");
        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));

        System.out.println("task2");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "->" + ((i % 2) == 0 ? "четное" : "нечетное"));
        }

        System.out.println("task3");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("понедельник");
                    System.out.println("это рабочий день");
                    break;
                case 1:
                    System.out.println("вторник");
                    System.out.println("это рабочий день");
                    break;
                case 2:
                    System.out.println("среда");
                    System.out.println("это рабочий день");
                    break;
                case 3:
                    System.out.println("четврг");
                    System.out.println("это рабочий день");
                    break;
                case 4:
                    System.out.println("пятница");
                    System.out.println("это рабочий день");
                    break;
                case 5:
                    System.out.println("суббота");
                    System.out.println("это выходной день");
                    break;
                case 6:
                    System.out.println("воскресенье");
                    System.out.println("это выходной день");
                    break;
            }
        }
        System.out.println("task4");
        int s = 1;
        for (int i = 1; i <= 14; i++) {
            s = s * i;
            System.out.println("промежуточный результат " + s);
            if (s > 1000) {
                System.out.println("достигнут максимальный результат");
                break;
            }
        }
        System.out.println("task5");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) System.out.println(i);
        }

    }
}
