package Ejercicio5;

import java.util.*;

public class PersonList {
    Vector peopleList;

    public PersonList() {
        peopleList = new Vector();
    }

    public void addPerson(Person p) {
        peopleList.add(p);
    }

    public void removePerson(int i) {
        peopleList.removeElementAt(i);
    }

    public void clearList() {
        peopleList.removeAllElements();
    }
}