package org.example.work12.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Record> records;
    public PhoneDirectory() {
        records=new ArrayList<>();
    }
    public boolean add(Record record){
        return records.add(record);
    }
    public Record find(String name){
        Record record = null;
        for (Record element : records){
            if(element.getName().equals(name)){
                record=element;
                break;
            }
        }
        return record;
    }
    public List<Record> findAll(String name){
        List<Record> recordName = new ArrayList<>();
        for (Record record:records){
            if(record.getName().equals(name)){
                recordName.add(record);
            }
        }
        return recordName.isEmpty()?null:recordName;
    }
}
