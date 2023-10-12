package Ejercicio2.Inmuebles;

public class GatedCommunityHouse extends UrbanHouse {
    protected static double areaValue = 2500000;
    protected int managementFee;
    protected boolean hasPool;
    protected boolean hasSportsFields;

    public GatedCommunityHouse(int realEstateId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int managementFee, boolean hasPool, boolean hasSportsFields) {
        super(realEstateId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.managementFee = managementFee;
        this.hasPool = hasPool;
        this.hasSportsFields = hasSportsFields;
    }

    void print() {
        super.print();
        System.out.println("Valor de la administracion = $" + managementFee);
        System.out.println("Tiene piscina? = " + hasPool);
        System.out.println("Tiene campos deportivos? = " + hasSportsFields);
        System.out.println();
    }
}

