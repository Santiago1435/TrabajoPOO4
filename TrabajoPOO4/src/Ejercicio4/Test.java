package Ejercicio4;

public class Test {
    public static void main(String args[]) {
        Team team1 = new Team("Sky", "Estados Unidos");
        Sprinter sprinter1 = new Sprinter(123979, "Geraint Thomas", 320, 25);
        Climber climber1 = new Climber(123980, "Egan Bernal", 25, 10);
        TimeTriallist timeTriallist1 = new TimeTriallist(123981, "Jonathan Castroviejo", 120);

        team1.addCyclist(sprinter1);
        team1.addCyclist(climber1);
        team1.addCyclist(timeTriallist1);

        sprinter1.setAccumulatedTime(365);
        climber1.setAccumulatedTime(385);
        timeTriallist1.setAccumulatedTime(370);

        team1.calculateTotalTime();
        team1.print();
        team1.listTeam();
    }
}

