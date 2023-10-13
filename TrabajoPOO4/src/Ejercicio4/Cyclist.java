package Ejercicio4;

public abstract class Cyclist {
    private int identifier;
    private String name;
    private int accumulatedTime = 0;

    public Cyclist(int identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    abstract String printType();

    protected int getIdentifier() {
        return identifier;
    }

    protected void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getGeneralPosition(int generalPosition) {
        return generalPosition;
    }

    protected void setGeneralPosition(int generalPosition) {
        generalPosition = generalPosition;
    }

    protected int getAccumulatedTime() {
        return accumulatedTime;
    }

    protected void setAccumulatedTime(int accumulatedTime) {
        this.accumulatedTime = accumulatedTime;
    }

    protected void print() {
        System.out.println("Identificador" + identifier);
        System.out.println("Nombre = " + name);
        System.out.println("Tiempo acumulado = " + accumulatedTime);
    }
}
