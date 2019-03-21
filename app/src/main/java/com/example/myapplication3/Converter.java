package com.example.myapplication3;

public class Converter {

    public String NumbertoWords(int x){

        if (x == 1000000) {
            return "миллион";
        }
        if(x==0)
        {
            return "ноль";
        }
        StringBuilder Builder = new StringBuilder();
        if (x / 1000 > 0) {
            Builder.append(NumberFrom1to999(x / 1000, true));
            Builder.append(" ");
            Builder.append(FormOf1000(x / 1000));
            Builder.append(" ");
        }
        x = x % 1000;
        if (x > 0) {
            Builder.append(NumberFrom1to999(x, false));
        }
        return Builder.toString().trim();
    }

    private String FormOf1000(int numberOf1000) {

        if ((5 <= numberOf1000 % 100) && (numberOf1000 % 100 <= 20))
            return "тысяч";
        if (numberOf1000 % 10 == 1)
            return "тысяча";
        if ((2 <= numberOf1000 % 10) && (numberOf1000 % 10 <= 4)) {
            return "тысячи";
        }
        return "тысяч";
    }

    private String FormFor1to9(int x, boolean is_female) {
        switch(x) {
            case 1:
                return is_female ? "одна" : "один";
            case 2:
                return is_female ? "две" : "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default:
                throw new IllegalArgumentException("Exeption");
        }
    }

    private String FormFor10to19(int x) {
        switch(x) {
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
            default:
                throw new IllegalArgumentException("Exeption");
        }
    }
    private String TensFrom2to9(int x) {
        switch(x) {
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятьдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семьдесят";
            case 8:
                return "восемьдесят";
            case 9:
                return "девяносто";
            default:
                throw new IllegalArgumentException("Exeption");
        }
    }
    private String HundredsFrom1to9(int x) {
        switch(x) {
            case 1:
                return "сто";
            case 2:
                return "двести";
            case 3:
                return "триста";
            case 4:
                return "четыреста";
            case 5:
                return "пятьсот";
            case 6:
                return "шестьсот";
            case 7:
                return "семьсот";
            case 8:
                return "восемьсот";
            case 9:
                return "девятьсот";
            default:
                throw new IllegalArgumentException("Exeption");
        }
    }

    private String NumberFrom1to999(int x, boolean is_female) {
        StringBuilder Builder = new StringBuilder();
        if (x / 100 > 0) {
            Builder.append(HundredsFrom1to9(x / 100));
            Builder.append(" ");
        }
        x = x % 100;
        if ((10 <= x) && (x <= 19)) {
            Builder.append(FormFor10to19(x));
            return Builder.toString();
        }
        if (x / 10 > 0) {
            Builder.append(TensFrom2to9(x / 10));
            Builder.append(" ");
        }
        x = x % 10;
        if (x > 0) {
            Builder.append(FormFor1to9(x, is_female));
        }
        return Builder.toString().trim();
    }
}
