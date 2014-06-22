package com.epam.motorcycle.entity;

import java.math.BigDecimal;

public class SportBike extends  MotoWorld {

    private int horsepower;
    private int maxspeed;
    private boolean slope;
    private lube parts;

    public SportBike(MotoWorld.Sparepart sparepart, int price, int horsepower, int maxspeed, boolean slope, lube parts) {
        super(sparepart, price);
        this.horsepower = horsepower;
        this.maxspeed = maxspeed;
        this.slope = slope;
        this.parts = parts;
        this.price = new BigDecimal(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportBike)) return false;

        SportBike sportBike = (SportBike) o;

        if (maxspeed != sportBike.maxspeed) return false;
        if (slope != sportBike.slope) return false;
        if (horsepower != sportBike.horsepower) return false;
        if (parts != sportBike.parts) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = horsepower;
        result = 31 * result + maxspeed;
        result = 31 * result + (slope ? 1 : 0);
        result = 31 * result + parts.hashCode();
        return result;
    }

    public  java.math.BigDecimal getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "SportBike{" +
                "horsepower=" + horsepower +
                ", maxspeed=" + maxspeed +
                ", slope=" + slope +
                ", parts=" + parts +
                '}';
    }

    public String chengePosition() {
        if (slope) {
            return "sport bike leans";
        } else return "sportbike does not tilt";
    }
    public enum lube{
        shock,tire,chain,filmtr;


        @Override
        public String toString() {
            return name().toLowerCase(); //?????
        }
    }

}
