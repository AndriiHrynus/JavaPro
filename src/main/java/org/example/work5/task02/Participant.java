package org.example.work5.task02;

public class Participant {
    private double runLength;
    private double jumpLength;
    protected static boolean flag=true;

    public Participant(double runLength, double jumpLength) {
        this.runLength = runLength;
        this.jumpLength = jumpLength;
    }

    public String run(){
       return " run ";
    }
    public String jump(){
        return " jump ";
    }

    public double getRunLength() {
        return runLength;
    }

    public double getJumpLength() {
        return jumpLength;
    }
}
