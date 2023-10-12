package Ejercicio2.Inmuebles;

public class StudioApartment extends Apartment {
    protected static double areaValue = 1500000;

    public StudioApartment(int realEstateId, int area, String address, int i, int i1) {
        super(realEstateId, area, address, 1, 1);
    }

    void print() {
        super.print();
    }
}

