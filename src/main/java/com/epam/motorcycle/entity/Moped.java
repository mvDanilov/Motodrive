package com.epam.motorcycle.entity;

import java.math.BigDecimal;

public class Moped extends MotoWorld {

    private int voltage;
    private int state;
    private int power;


    public Moped(int voltage, int state, int power, int price) {
        super(sparepart,price);
        this.power = power;
        this.state = state;
        this.voltage = voltage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moped)) return false;

        Moped moped = (Moped) o;

        if (power != moped.power) return false;
        if (state != moped.state) return false;
        if (voltage != moped.voltage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = voltage;
        result = 31 * result + state;
        result = 31 * result + power;
        return result;
    }

    public String createStatisticsState() {
        if (state * voltage > power) {
            return "moped has failed";
        } else
            return "moped created " + (state * power) + "V races voltage ";
    }


    @Override
    public String toString () {
        return "Moped{" +
                "voltage=" + voltage +
                ", state=" + state +
                ", power=" + power +
                '}';
    }

}
