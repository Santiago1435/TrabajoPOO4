package Ejercicio4;

public class TimeTriallist extends Cyclist {
    private double maxSpeed;

    public TimeTriallist(int identifier, String name, double maxSpeed) {
        super(identifier, name);
        this.maxSpeed = maxSpeed;
    }

    protected double getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Aceleracion promedio = " + maxSpeed);
    }

    protected String printType() {
        return "Es un contrarrelojista";
    }
}

