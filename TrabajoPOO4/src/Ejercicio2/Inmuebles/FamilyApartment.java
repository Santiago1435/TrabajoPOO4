package Ejercicio2.Inmuebles;

public class FamilyApartment extends Apartment {
    protected static double areaValue = 2000000;
    protected int administrationValue;

    public FamilyApartment(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms, int administrationValue) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms);
        this.administrationValue = administrationValue;
    }

    void print() {
        super.print();
        System.out.println("Valor de administracion = $" + administrationValue);
        System.out.println();
    }
}
