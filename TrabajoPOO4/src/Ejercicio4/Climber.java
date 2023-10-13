package Ejercicio4;

public class Climber extends Cyclist {
    private double averageAcceleration;
    private double slopeDegree;

    public Climber(int identifier, String name, double averageAcceleration, double slopeDegree) {
        super(identifier, name);
        this.averageAcceleration = averageAcceleration;
        this.slopeDegree = slopeDegree;
    }

    protected double getAverageAcceleration() {
        return averageAcceleration;
    }

    protected void setAverageAcceleration(double averageAcceleration) {
        this.averageAcceleration = averageAcceleration;
    }

    protected double getSlopeDegree() {
        return slopeDegree;
    }

    protected void setSlopeDegree(double slopeDegree) {
        this.slopeDegree = slopeDegree;
    }

    protected void print() {
        super.print();
        System.out.println("Aceleracion Promedio = " + averageAcceleration);
        System.out.println("Grado de rampa = " + slopeDegree);
    }

    protected String printType() {
        return "It's a climber";
    }
}