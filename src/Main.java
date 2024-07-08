import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        int sum = 0;
        int month = 0;
        int finalGoal = 2_459_000;
        int monthlyContribution = 15_000;
        while (sum < finalGoal) {
            month += 1;
            sum += monthlyContribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + "рублей");

        }



        //task 2
        System.out.println();
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //task 3
        System.out.println();
        finalGoal = 12_000_000;
        for (i = 1; i <= 10; i++) {
            finalGoal += (finalGoal / 1000 * 17);
            finalGoal -= (finalGoal / 1000 * 8);
            System.out.println("Год " + i + ", численность населения составляет " + finalGoal);
        }

        //task 4
        System.out.println();
        month = 0;
        float total = 0f;
        finalGoal = 12_000_000;
        float interestRate = 1.07f;
        do {
            month += 1;
            total += monthlyContribution;
            total *= interestRate;
            System.out.println("Год " + month + ", численность населения составляет " + total);
        } while (total <= finalGoal);

        //task 5
        System.out.println();
        month = 0;
        total = 0f;
        do {
            month += 1;
            total += monthlyContribution;
            total *= interestRate;
            if (month % 6 == 0) {
                System.out.println("Год " + month + ", численность населения составляет " + total);
            }
        } while (total <= finalGoal);

        //task 6
        System.out.println();
        month = 0;
        total = 0f;
        do {
            month += 1;
            total += monthlyContribution;
            total *= interestRate;
            if (month % 6 == 0) {
                System.out.println("Год " + month + ", численность населения составляет " + total);
            }
        } while (month != 12 * 9);

        //task 7
        System.out.println();
        int firstFriday = 1;
        int countOfAllDays = 31;
        int everyFriday = 7;
        while (firstFriday <= countOfAllDays) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += everyFriday;
        }

        //task 8
        System.out.println();
        int start = 2024 - 200;
        int end = 2024 + 100;
        int year = 0;
        int cometArrivalReplay = 79;
        while (year <= end) {
            if (year >= start) {
                System.out.println(year);
            }
            year += cometArrivalReplay;
        }
        System.out.println();

    }
}