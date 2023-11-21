package org.example.work13;

import java.util.Objects;
public class FileData implements Comparable<FileData>{
    private String nameFile;
    private int sizeFile;
    private String pathFile;
    public FileData(String nameFile, int sizeFile, String pathFile) {
        this.nameFile = nameFile;
        this.sizeFile = sizeFile;
        this.pathFile = pathFile;
    }
    public int getSizeFile() {
        return sizeFile;
    }
    public String getPathFile() {
        return pathFile;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return Double.compare(sizeFile, fileData.sizeFile) == 0 && Objects.equals(nameFile, fileData.nameFile) && Objects.equals(pathFile, fileData.pathFile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameFile, sizeFile, pathFile);
    }
    @Override
    public String toString() {
        return nameFile;
    }
    @Override
    public int compareTo(FileData o) {
        return sizeFile-o.getSizeFile();
    }
}
