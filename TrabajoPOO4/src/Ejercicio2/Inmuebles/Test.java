package Ejercicio2.Inmuebles;

public class Test {
    public static void main(String[] args) {
        FamilyApartment apartment1 = new FamilyApartment(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Informacion Apartamento");
        apartment1.calculateSalePrice(apartment1.areaValue);
        apartment1.print();

        System.out.println("Informacion Apartaestuido");
        StudioApartment studioApartment1 = new StudioApartment(12354, 50, "Avenida Caracas 30-15", 1, 1);
        studioApartment1.calculateSalePrice(studioApartment1.areaValue);
        studioApartment1.print();
    }
}

