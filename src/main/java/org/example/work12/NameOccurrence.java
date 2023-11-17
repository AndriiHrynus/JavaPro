package org.example.work12;

public class NameOccurrence {
    private String name;
    private int occurrence;

    public String getName() {
        return name;
    }
    public int getOccurrence() { return occurrence;}
    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }
    public NameOccurrence(String name) {
        this.name = name;
        occurrence=0;
    }
    @Override
    public String toString() {
        return '{'+"name: " + name +", occurrence: " + occurrence +'}';
    }
}
