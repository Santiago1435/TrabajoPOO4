package Ejercicio2.Inmuebles;

public class ResidentialProperty extends RealEstate {
    protected int numberOfRooms;
    protected int numberOfBathrooms;

    public ResidentialProperty(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(realEstateId, area, address);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    void print() {
        super.print();
        System.out.println("Numero de habitaciones = " + numberOfRooms);
        System.out.println("Numero de baños = " + numberOfBathrooms);
    }
}

