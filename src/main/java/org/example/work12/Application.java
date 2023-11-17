package org.example.work12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Java", "JavaScript", "C++", "Python", "PHP",
                "Java", "Java", "JavaScript", "PHP", "Delphi"));
        countOccurance(strings,"JavaScript");
        System.out.println(findUnique(strings));
        System.out.println(findOccurance(strings));

        String [] arrays = {"Java", "JavaScript", "C++", "Python", "PHP",
                "Java", "Java", "JavaScript", "PHP", "Delphi"};
        System.out.println(toList(arrays));
    }
    private static void countOccurance(List<String> words, String target) {
        int count = 0;
        for (String element : words) {
            if (target.equals(element)) count++;
        }
        System.out.println("word "+target+" kil: "+count);
    }
    private static List<String > toList(String[] words){
        return Arrays.asList(words);
    }
    private static List<String > findUnique(List<String> words){
        List<String> unique = new ArrayList<>();
        for (String word : words) {
            if(!unique.contains(word)) unique.add(word);
        }
        return unique;
    }
    private static List<NameOccurrence> findOccurance(List<String> words){
        List<NameOccurrence> nameOccurrences = new ArrayList<>();
        List<String> unique = findUnique(words);
        for (String word : unique) {
            nameOccurrences.add(new NameOccurrence(word));
        }
        for (String word : words) {
            for (NameOccurrence element : nameOccurrences) {
                if(word.equals(element.getName())){
                    int kil = element.getOccurrence()+1;
                    element.setOccurrence(kil);
                }
            }
        }
        return nameOccurrences;
    }
}
