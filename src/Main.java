import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        int summ = 0;
        int month = 0;
        while (summ < 2_459_000) {
            month += 1;
            summ += 15_000;

        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + summ + "рублей");


        //task 2
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
        int y = 12_000_000;
        for (i = 1; i <= 10; i++) {
            y += (y / 1000 * 17);
            y -= (y / 1000 * 8);
            System.out.println("Год " + i + ", численность населения составляет " + y);
        }

        //task 4
        System.out.println();
        month = 0;
        float itog = 0f;
        do {
            month += 1;
            itog += 15_000;
            itog *= 1.07f;
            System.out.println("Год " + month + ", численность населения составляет " + itog);
        } while (itog <= 12_000_000);

        //task 5
        System.out.println();
        month = 0;
        itog = 0f;
        do {
            month += 1;
            itog += 15_000;
            itog *= 1.07f;
            if (month % 6 == 0) {
                System.out.println("Год " + month + ", численность населения составляет " + itog);
            }
        } while (itog <= 12_000_000);

        //task 6
        System.out.println();
        month = 0;
        itog = 0f;
        do {
            month += 1;
            itog += 15_000;
            itog *= 1.07f;
            if (month % 6 == 0) {
                System.out.println("Год " + month + ", численность населения составляет " + itog);
            }
        } while (month != 12 * 9);

        //task 7
        System.out.println();
        int firstFriday = 1;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        }

        //task 8
        System.out.println();
        int start = 2024 - 200;
        int end = 2024 + 100;
        int year = 0;
        while (year <= end) {
            if (year >= start) {
                System.out.println(year);
            }
            year += 79;
        }

    }
}