package Ejercicio2.Inmuebles;

public class RuralHouse extends House {
    protected static double areaValue = 1500000;
    protected int distanceToTown;
    protected int altitude;

    public RuralHouse(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int distanceToTown, int altitude) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.distanceToTown = distanceToTown;
        this.altitude = altitude;
    }

    void print() {
        super.print();
        System.out.println("Distancia a la cabecera municipal = " + distanceToTown + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitude + " metros.");
        System.out.println();
    }
}
