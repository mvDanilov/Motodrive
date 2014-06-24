package com.epam.motorcycle.entity;

import java.math.BigDecimal;

public abstract class MotoWorld implements Cloneable {
    protected BigDecimal price;
    protected Sparepart  sparepart;
    protected types_of_motorcycle types_of_motorcycle;


    public enum Type{
        HARLEY_DAVIDSON,Kawasaki,Yamaha

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected MotoWorld(Sparepart sparepart, int price){
        this.sparepart = sparepart;
        this.price = new BigDecimal(price);

    }

    public BigDecimal getPrice(){

        return price;
    }
    public enum types_of_motorcycle {
        moped, bike, sport_bikee;
    }

    public enum Sparepart{
        ARMOTIZATOR,ENGINE,TIRES

    }

}

