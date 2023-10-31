package org.example.work7;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("hello", 'l'));
        System.out.println(findWordPosition("Apollo","pollo"));
        System.out.println(findWordPosition("Apple","Plant"));
        System.out.println(stringReverse("Apollo"));
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));
        games();
    }
    public static int findSymbolOccurance(String str, char ch){
        int count =0;
        char [] array = str.toCharArray();
        for (char c: array) {
            if(c==ch) count++;
        }
        return count;
    }
    public static int findWordPosition(String source, String target){
        return (!source.contains(target))?-1:source.indexOf(target.charAt(0));
    }
    public static String stringReverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char [] array = str.toCharArray();
        for (int i = array.length-1; i >=0 ; i--) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }
    public static boolean isPalindrome(String source){
        String target = stringReverse(source);
        return (source.equals(target))?true:false;
    }
    public static void games(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[new Random().nextInt(words.length)];
        System.out.println(word);
        Scanner scanner = new Scanner(System.in);
        while (true){
            String answer = scanner.nextLine();
            if(answer.equals(word)){
                System.out.println("true");
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                stringBuilder.append("*");
            }
            for (int i = 0; i < answer.length(); i++) {
                if(word.charAt(i)==answer.charAt(i)){
                    stringBuilder.setCharAt(i,word.charAt(i));
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
