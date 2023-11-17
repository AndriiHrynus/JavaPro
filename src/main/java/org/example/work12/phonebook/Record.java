package org.example.work12.phonebook;

public class Record {
    private String name;
    private String phones;
    public Record(String name, String phones) {
        this.name = name;
        this.phones = phones;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", phones='" + phones + '\'' +
                '}';
    }
}
