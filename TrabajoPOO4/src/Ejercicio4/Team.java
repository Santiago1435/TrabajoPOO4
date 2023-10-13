package Ejercicio4;

import java.util.*;

public class Team {
    private String name;
    private static double totalTime;
    private String country;
    Vector cyclistList;

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        totalTime = 0;
        cyclistList = new Vector();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    void addCyclist(Cyclist cyclist) {
        cyclistList.add(cyclist);
    }

    void listTeam() {
        for (int i = 0; i < cyclistList.size(); i++) {
            Cyclist c = (Cyclist) cyclistList.elementAt(i);
            System.out.println(c.getName());
        }
    }

    void searchCyclist() {
        Scanner sc = new Scanner(System.in);
        String cyclistName = sc.next();
        for (int i = 0; i < cyclistList.size(); i++) {
            Cyclist c = (Cyclist) cyclistList.elementAt(i);
            if (c.getName().equals(cyclistName)) {
                System.out.println(c.getName());
            }
        }
    }

    void calculateTotalTime() {
        for (int i = 0; i < cyclistList.size(); i++) {
            Cyclist c = (Cyclist) cyclistList.elementAt(i);
            totalTime = totalTime + c.getAccumulatedTime();
        }
    }

    void print() {
        System.out.println("Nombre del equipo = " + name);
        System.out.println("Pais = " + country);
        System.out.println("Total del tiempo del equipo = " + totalTime);
    }
}

