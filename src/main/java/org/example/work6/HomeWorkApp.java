package org.example.work6;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sum(11,10));
        positiveNegative(-1);
        System.out.println(boolPositiveNegative(-1));
        print("hello",2);
        System.out.println(isYear(1999));
    }

    public static void printThreeWords() {
        System.out.printf("%s%n%s%n%s%n", "Orange", "Banana", "Apple");
    }
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        String answer = (a+b>=0)?"sum positive":"sum negative";
        System.out.println(answer);
    }
    public static void printColor() {
        int value =99;
        if (value <= 0) {
            System.out.println("red");
        } else {
            if (value <= 100) {
                System.out.println("yellow");
            } else {
                System.out.println("green");
            }
        }
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 1;
        String answer=(a>=b)?"a>=b":"a<b";
        System.out.println(answer);
    }
    public static boolean sum(int a, int b){
        int rez = a+b;
        return (rez>10 && rez<=20)?true:false;
    }
    public static void positiveNegative(int a){
        String answer=(a>=0)?"positive":"negative";
        System.out.println(answer);
    }
    public static boolean boolPositiveNegative(int a){
        return (a<0)?true:false;
    }
    public static void print(String str, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    public static boolean isYear(int year){
        return (year%4==0 && year%100!=0) || year%400==0 ?true:false;
    }
}