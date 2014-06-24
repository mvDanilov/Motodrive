package com.epam.motorcycle.entity;

public class Bike extends MotoWorld{

    private int oxidation;
    private int horsepower;
    private int temperature;
    private Type type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;

        Bike bike = (Bike) o;

        if (horsepower != bike.horsepower) return false;
        if (oxidation != bike.oxidation) return false;
        if (temperature != bike.temperature) return false;
        if (type != bike.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oxidation;
        result = 31 * result + horsepower;
        result = 31 * result + temperature;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "oxidation=" + oxidation +
                ", horsepower=" + horsepower +
                ", temperature=" + temperature +
                ", type=" + type +
                '}';
    }

    public Bike(MotoWorld.Sparepart sparepart,int oxidation,int horsepower,int temperature, int price) {
        super(sparepart,price);
        this.oxidation = oxidation;
        this.horsepower = horsepower;
        this.temperature = temperature;
        this.type = type;



    }
}
