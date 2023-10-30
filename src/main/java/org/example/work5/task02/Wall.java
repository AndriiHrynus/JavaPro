package org.example.work5.task02;

public class Wall extends Barrier{
    public Wall(double lengthOrHeight) {
        super(lengthOrHeight);
    }

    @Override
    public void overcome() {
        if(getParticipant().getJumpLength()<getLengthOrHeight()) {
            System.out.printf("Учасник %s  не %s перешкоду %s на дистанції %f. Пройдено %f",
                    getParticipant().getClass().getSimpleName(), getParticipant().jump(),
                    getClass().getSimpleName(), getLengthOrHeight(), getParticipant().getJumpLength());
            Participant.flag=false;
        }
        else {
            System.out.printf("Учасник %s %s перешкоду %s на дистанції %f.",
                    getParticipant().getClass().getSimpleName(), getParticipant().jump(),
                    getClass().getSimpleName(), getLengthOrHeight());
        }
    }
}
