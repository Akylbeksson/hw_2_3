package com.company;

public class Main {

    public static String phrase(int temperatureOutside, int ageOfPerson) {

        if (temperatureOutside >= -20 && temperatureOutside <= 30 && ageOfPerson > 20 && ageOfPerson < 45) {
            return "YoU may go for a walk";
        } if (temperatureOutside >= 0 && temperatureOutside <= 28 && ageOfPerson < 20) {
            return "YOu may go for a walk";
        } if (temperatureOutside >= -10 && temperatureOutside <= 25 && ageOfPerson > 45) {
            return "you may go for a walk";
        } else {
            return "stay at home";
        }

    }

    public static void main(String[] args) {

        System.out.println(phrase(-5, 25));
        System.out.println(phrase(5, 22));
        System.out.println(phrase(0, 52));
        System.out.println(phrase(-15, 55));
        System.out.println(phrase(-25, 28));

    }

}



