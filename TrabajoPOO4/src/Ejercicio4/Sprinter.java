package Ejercicio4;

public class Sprinter extends Cyclist {
    private double averagePower;
    private double averageSpeed;

    public Sprinter(int identifier, String name, double averagePower, double averageSpeed) {
        super(identifier, name);
        this.averagePower = averagePower;
        this.averageSpeed = averageSpeed;
    }

    protected double getAveragePower() {
        return averagePower;
    }

    protected void setAveragePower(double averagePower) {
        this.averagePower = averagePower;
    }

    protected double getAverageSpeed() {
        return averageSpeed;
    }

    protected void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Potencia promedio = " + averagePower);
        System.out.println("Velocidad promedoo = " + averageSpeed);
    }

    protected String printType() {
        return "It's a sprinter";
    }
}

