public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 3
        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        //Task 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 5
        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 1996; i = i + 4) {
            System.out.println(i + " - год является високосным.");
        }

        //Task 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        //Task 7
        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        //Task 8
        System.out.println("\nЗадача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        //Task 9
        System.out.println("\nЗадача 9");
        double savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings + savings / 100;
            savings = savings + deposit;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + Math.round(savings) + " рублей.");
        }

        //Task 10
        System.out.println("\nЗадача 10");
        int multiplier = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * multiplier;
            System.out.println(i + " * 2 = " + result);
        }
    }
}
