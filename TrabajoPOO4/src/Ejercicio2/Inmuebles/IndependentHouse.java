package Ejercicio2.Inmuebles;

public class IndependentHouse extends UrbanHouse {
    protected static double areaValue = 3000000;

    public IndependentHouse(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
    }

    void print() {
        super.print();
        System.out.println();
    }
}

