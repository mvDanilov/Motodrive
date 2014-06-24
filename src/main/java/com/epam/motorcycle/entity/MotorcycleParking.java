package com.epam.motorcycle.entity;

import java.math.BigDecimal;
import java.util.*;


public class MotorcycleParking implements Cloneable {
    public List<MotoWorld> MotoWorlds = new ArrayList<MotoWorld>();
    private String name;
    private int length;
    private int width;

    public MotorcycleParking(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public MotorcycleParking createCope() {
        MotorcycleParking copy = null;
        try {
            copy = (MotorcycleParking) super.clone();
            copy.MotoWorlds = totalCloneViewsList(MotoWorlds);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    private List<MotoWorld> totalCloneViewsList(List<MotoWorld> moto_worlds) {

        List<MotoWorld> newList = new ArrayList<>();
        for (MotoWorld motoWorld : newList) {
            newList.add((MotoWorld) moto_worlds);
        }
        return newList;

    }

    public void disassembled_into_parts(int index) {
        MotoWorlds.remove(index);
    }

    public void assembled_from_parts(MotoWorld... MotoWorld) {
        for (MotoWorld moto_world1 : MotoWorld)
            MotoWorlds.add(moto_world1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MotorcycleParking)) return false;

        MotorcycleParking that = (MotorcycleParking) o;

        if (length != that.length) return false;
        if (width != that.width) return false;
        if (MotoWorlds != null ? !MotoWorlds.equals(that.MotoWorlds) : that.MotoWorlds != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = MotoWorlds != null ? MotoWorlds.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + length;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "MotorcycleParking{" +
                "MotoWorlds=" + MotoWorlds +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public void estaplishElements(List<MotoWorld> moto_word) {
        this.MotoWorlds = moto_word;
    }


    public BigDecimal totalSummElements() {
        BigDecimal totalSumm = new BigDecimal(0);
        for (MotoWorld s : MotoWorlds) {
            totalSumm = totalSumm.add(s.getPrice());
        }
        return totalSumm;

    }

}

