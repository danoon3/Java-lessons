package ru.geekbrains.java_one.lesson_a.online;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HelloWorld {

    // Задание №1
    private static float math(int a, int b, int c, int d){
             return a * (b + (c / d));
    }
    // Задание №2
    private static boolean sum(int a, int b){
        if (a + b >= 10 && a + b <= 20){
            return true;
        } else {
            return false;
        }
    }

    // Задание №3
    private static String compare(int a){
        if(a>=0){
           return ("Число положительное");
        }else {
            return ("Число отрицательное");
        }
    }

    // Задание №4
    private static String name(String a){
        return "Привет, " + a + "!";
    }

    // Задани №5
    private static int year(int a){
        if(((a % 4 == 0) || (a % 400 == 0)) && a % 100 != 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        return a;
    }

    public static void main(String[] args){
        double i = math(1,2,3,4);
        System.out.println(i);

        boolean a = sum(5, 5);
        System.out.println(a);

       System.out.println(compare(100));

       System.out.println(name("Ирина"));

       System.out.println(year(2020));
    }




}
