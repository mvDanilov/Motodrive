package com.epam.motorcycle.main;


import com.epam.motorcycle.entity.Moped;
import com.epam.motorcycle.entity.MotoWorld;
import com.sun.media.jfxmedia.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Moped moped = new Moped(MotoWorld.Sparepart.ARMOTIZATOR, 30, 20, 50, 100000);
        Logger.INFO("qqweqweqwe {}", Moped);


    }
}
