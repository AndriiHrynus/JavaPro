package org.example.work5.task02;

import java.util.regex.Pattern;

public class Racetrack  extends Barrier{
    public Racetrack(double lengthOrHeight) {
        super(lengthOrHeight);
    }

    @Override
    public void overcome() {
        if(getParticipant().getRunLength()<getLengthOrHeight()){
            System.out.printf("Учасник %s  не %s перешкоду %s на дистанції %f. Пройдено %f",
                    getParticipant().getClass().getSimpleName(), getParticipant().run(),
                    getClass().getSimpleName(), getLengthOrHeight(), getParticipant().getRunLength());
            Participant.flag=false;
        }
        else{
        System.out.printf("Учасник %s %s перешкоду %s на дистанції %f.",
                getParticipant().getClass().getSimpleName(), getParticipant().run(),
                getClass().getSimpleName(), getLengthOrHeight());
        }
    }
}
