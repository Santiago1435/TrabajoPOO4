package Ejercicio2.Inmuebles;

public class RealEstate {
    protected int realEstateId;
    protected int area;
    protected String address;
    protected double salePrice;

    public RealEstate(int realEstateId, int area, String address) {
        this.realEstateId = realEstateId;
        this.area = area;
        this.address = address;
    }

    double calculateSalePrice(double areaValue) {
        salePrice = area * areaValue;
        return salePrice;
    }

    void print() {
        System.out.println("Identificador inmobilario = " + realEstateId);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + address);
        System.out.println("Precio de Venta = $" + salePrice);
    }
}
