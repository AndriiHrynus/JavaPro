package org.example.work5.task02;

public class Barrier {
    private double lengthOrHeight;
    private Participant participant;
    public Barrier(double lengthOrHeight) {
        this.lengthOrHeight = lengthOrHeight;
    }

    public void overcome(){}

    public double getLengthOrHeight() {
        return lengthOrHeight;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
}
