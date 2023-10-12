package Ejercicio2.Inmuebles;

import Ejercicio2.Inmuebles.RealEstate;

public class BusinessProperty extends RealEstate {
    enum Type {INTERNAL, STREET}
    protected Type propertyType;

    public BusinessProperty(int realEstateId, int area, String address, Type propertyType) {
        super(realEstateId, area, address);
        this.propertyType = propertyType;
    }

    void print() {
        super.print();
        System.out.println("Property type = " + propertyType);
    }
}
