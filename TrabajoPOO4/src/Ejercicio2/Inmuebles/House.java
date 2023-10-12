package Ejercicio2.Inmuebles;

public class House extends ResidentialProperty {
    protected int numberOfFloors;

    public House(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms);
        this.numberOfFloors = numberOfFloors;
    }

    void print() {
        super.print();
        System.out.println("Numero de pisos = " + numberOfFloors);
    }
}
