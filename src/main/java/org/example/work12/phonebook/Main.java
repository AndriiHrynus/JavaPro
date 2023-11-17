package org.example.work12.phonebook;

public class Main {
    public static void main(String[] args) {
        Record recordIvan = new Record("Ivan", "0123");
        Record recordSemen = new Record("Semen", "0456");
        Record recordIvanNew = new Record("Ivan", "0257");
        Record recordOlena = new Record("Olena", "0123");
        Record recordOlenaNew = new Record("Olena", "7891");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add(recordIvan);
        phoneDirectory.add(recordSemen);
        phoneDirectory.add(recordIvanNew);
        phoneDirectory.add(recordOlena);
        phoneDirectory.add(recordOlenaNew);

        System.out.println(phoneDirectory.find("Ivan"));
        System.out.println(phoneDirectory.findAll("Olena"));
        System.out.println(phoneDirectory.find("Ira"));
        System.out.println(phoneDirectory.findAll("Ira"));
    }
}
