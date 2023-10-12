package Ejercicio2.Inmuebles;

public class Apartment extends ResidentialProperty {
    public Apartment(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms);
    }

    void print() {
        super.print();
    }
}

