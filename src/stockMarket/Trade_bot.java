package stockMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Trade_bot implements stockMarket {
    List date = new ArrayList<>();

    @Override
    public void people(String cmd, String name, Double cash, String name_cash) {
        Main new_comand = new Main();
        if (cmd.equals("/add")) {
            date.add(0, name_cash);
            date.add(0, cash);
            date.add(0, name);
            System.out.println(date);
            new_comand.main(null);
        }
        if (cmd.equals("/trade")) {
            for (int i = 0; i < date.size(); i++) {
                if (name.equals(date.get(i))) {
                    Double old_cash = (Double) date.get(i + 1);
                    String old_name_cash = (String) date.get(i + 2);
                    trade(name, old_cash, old_name_cash);
                }
            }
        }
        if (cmd == "/bank") ;
        {
            System.out.println(date);
            new_comand.main(null);
        }
    }

    @Override
    public void trade(String name, Double old_cash, String old_name_cash) {
        Scanner scan = new Scanner(System.in);
        System.out.println("какую валюту вы хотите купить?");
        String name_valute = scan.nextLine();
        Double futureCurrency = 0.00;
        Double oldCurrency = 0.00;

        if (old_name_cash.equals("rub")) {
            oldCurrency = old_cash * 1.00;
        } else if (old_name_cash.equals("euro")) {
            oldCurrency = old_cash * 90.46;
        } else if (old_name_cash.equals("dollar")) {
            oldCurrency = old_cash * 75.85;
        } else if (old_name_cash.equals("tenge")) {
            oldCurrency = old_cash * 18.89;
        } else {
            System.out.println("Вы ввели не существующую в нашей базе валюту");
        }
        if (name_valute.equals("rub")) {
            futureCurrency = oldCurrency;
        } else if (name_valute.equals("euro")) {
            futureCurrency = oldCurrency / 96.46;
        } else if (name_valute.equals("dollar")) {
            futureCurrency = oldCurrency / 77.85;
        } else if (name_valute.equals("tenge")) {
            futureCurrency = oldCurrency / 23.89;
        } else {
            System.out.println("Вы ввели не существующую в нашей базе валюту");
        }
        for (int i = 0; i < date.size(); i++) {
            if (name.equals(date.get(i))) {
                date.set(i + 1, futureCurrency);
                date.set(i + 2, name_valute);
                System.out.println(date);
            }
        }
    }
}