package com.epam.motorcycle.entity;

import java.math.BigDecimal;

public class SportBike extends  MotoWorld {

    private int horsepower;
    private int maxspeed;




    public SportBike(MotoWorld.Sparepart sparepart, int price, int horsepower, int maxspeed, boolean slope, lube parts) {
        super(sparepart, price);
        this.horsepower = horsepower;
        this.maxspeed = maxspeed;
        this.price = new BigDecimal(price);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportBike)) return false;

        SportBike sportBike = (SportBike) o;

        if (maxspeed != sportBike.maxspeed) return false;

        if (horsepower != sportBike.horsepower) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = horsepower;
        result = 31 * result + maxspeed;
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

                '}';
    }

    public enum lube{
        shock,tire,chain,filmtr;


        @Override
        public String toString() {
            return name().toLowerCase(); //?????
        }
    }

}
