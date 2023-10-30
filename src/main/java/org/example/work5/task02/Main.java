package org.example.work5.task02;

public class Main {
    public static void main(String[] args) {
        Participant [] participants = {new People(5.0,2.0),new Cat(2.0,5.0), new Robot(5.0,5.0)};
        Barrier[] barriers = {new Racetrack(3.0), new Wall(3.0), new Wall(1.0), new Racetrack(1.0)};

        for (int i=0;i<participants.length;i++){
            for (int j=0;j<barriers.length;j++){
                barriers[j].setParticipant(participants[i]);
                barriers[j].overcome();
                System.out.println();
                if(Participant.flag==false) {
                    Participant.flag=true;
                    break;
                }
            }
        }
    }
}
