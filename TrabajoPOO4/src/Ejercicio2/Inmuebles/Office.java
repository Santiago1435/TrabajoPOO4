package Ejercicio2.Inmuebles;

public class Office extends BusinessProperty{
    protected static double valuePerArea = 3500000;
    protected boolean isGovernmentOffice;

    public Office(int realEstateId, int area, String address, Type propertyType, boolean isGovernmentOffice) {
        super(realEstateId, area, address, propertyType);
        this.isGovernmentOffice = isGovernmentOffice;
    }

    void print() {
        super.print();
        System.out.println("Is government office = " + isGovernmentOffice);
    }
}

