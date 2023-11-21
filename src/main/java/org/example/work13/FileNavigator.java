package org.example.work13;

import java.util.*;
public class FileNavigator {
    private Map<String, List<FileData>> mapFile;
    public FileNavigator() {
        mapFile = new HashMap<>();
    }

    public void add(String path, FileData file){
        if(file.getPathFile()!=path){
            System.out.println("wrong way");
            return;
        }
        if(mapFile.containsKey(path)){
            mapFile.get(path).add(file);
        } else{
            List<FileData> listFileData = new ArrayList<>();
            listFileData.add(file);
            mapFile.put(path,listFileData);
        }
    }
    public List<FileData> find(String path){
        if(mapFile.containsKey(path)){
            return mapFile.get(path);
        }
        return null;
    }
    public List<FileData> filterBySize(double size){
        List<FileData> rezList = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> element: mapFile.entrySet()) {
            List<FileData> elementFile = element.getValue();
            for (FileData file: elementFile) {
                if(file.getSizeFile()<=size){
                    rezList.add(file);
                }
            }
        }
        return rezList;
    }
    public void remove(String path){
        if(mapFile.containsKey(path)){
            mapFile.remove(path);
        }
    }
    public List<FileData> sortBySize(){
        List<FileData> list = filterBySize(Integer.MAX_VALUE);
        return list;
    }
    @Override
    public String toString() {
        return ""+ mapFile;
    }
}
