package Ejercicio2.Inmuebles;


public class CommercialProperty extends BusinessProperty {
    protected String shoppingMall;

    public CommercialProperty(int realEstateId, int area, String address, Type propertyType, String shoppingMall) {
        super(realEstateId, area, address, propertyType);
        this.shoppingMall = shoppingMall;
    }

    void print() {
        super.print();
        System.out.println("Centro comercial = " + shoppingMall);
    }
}

