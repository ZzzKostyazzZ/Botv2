package stockMarket;

import java.util.Scanner;

    class Main {
    static stockMarket value = new Trade_bot();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите команду");
        String comand = scan.nextLine();
        System.out.println(comand);


        if (comand.equals("/add")) {
            System.out.println("Введите имя");
            String name_people = scan.nextLine();
            System.out.println("Введите  название валюты");
            String name_cash = scan.nextLine();
            System.out.println("Введите  сумму");
            Double cash_people = scan.nextDouble();
            value.people(comand, name_people, cash_people, name_cash);
        }
        if (comand.equals("/bank")) {
            value.people(comand, null, null, null);
        }
        if (comand.equals("/trade")) {
            System.out.println("Введите имя пользователя");
            String name_people = scan.nextLine();
            value.people(comand, name_people, null, null);
        }
        if (comand.equals("/help")) {
            System.out.print("Дисклеймер:only 18 +... Трейд бот: преднозначен для обмена валют" + "\n" +
                    "Бот владеет несколькими командами:" + "\n" +
                    "команда /add добавляет пользователя с банком" + "\n" +
                    "команда /trade обменивает валюты" + "\n" +
                    "команда /bank показывает счет пользователя" + "\n" +
                    "команда /curse показывает курс трейда валют" + "\n" +
                    "Команда /help выводит справку по использованию"+"\n");
            main(null);
        }
        if (comand.equals("/curse")) {
            System.out.print("Так как у нас бот российский, то и курс от рубля" + "\n" +
                    "покупка:" +"\n"+
                    "euro = 96.46 rub; " +"\n"+
                    "dollar = 77.85 rub" +"\n" +
                    "tenge = 23.89" +"\n" +
                    "продажа:" +"\n" +
                    "euro = 90.46 rub; " +"\n"+
                    "dollar = 75.85 rub" +"\n" +
                    "tenge = 18.89"+"\n" );
            main(null);
        }
    }
}
