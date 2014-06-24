package com.epam.motorcycle.main;


import com.epam.motorcycle.entity.Moped;
import com.epam.motorcycle.entity.MotoWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main  {
    static private final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException{


        Moped moped = new Moped(MotoWorld.Sparepart.ARMOTIZATOR, 30, 20, 50, 100000);
        LOGGER.info("qweqeqwe{}",moped);


    }
}
