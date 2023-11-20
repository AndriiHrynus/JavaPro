package org.example.work13;

import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData = new FileData("files.txt", 40, "/path/to/file");
        FileData fileData1 = new FileData("java.txt", 39, "/path/to/file");
        FileData fileData2 = new FileData("delphi.txt", 41, "/path/to/delphi");
        FileData fileData3 = new FileData("javascript.txt", 38, "/path/to/javascript");
        fileNavigator.add("/path/to/file",fileData);
        fileNavigator.add("/path/to/file",fileData1);
        fileNavigator.add("/path/to/file",fileData2);
        fileNavigator.add("/path/to/javascript",fileData3);
        System.out.println(fileNavigator.find("/path/to/file"));
        System.out.println(fileNavigator.filterBySize(39));
        List<FileData> list = fileNavigator.sortBySize();
        Collections.sort(list);
        System.out.println(list);
        fileNavigator.remove("/path/to/file");
        System.out.println(fileNavigator);
    }
}
