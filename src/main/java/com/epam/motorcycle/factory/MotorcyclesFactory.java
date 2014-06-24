package com.epam.motorcycle.factory;

import com.epam.motorcycle.entity.*;
import com.epam.motorcycle.util.PropertiesManager;


import java.io.*;
import java.math.BigDecimal;
import  java.util.*;
public class MotorcyclesFactory {
    private final static Random r = new Random();
        private static PropertiesManager bikeManager;
        private static PropertiesManager sportBikeManager;
        private static PropertiesManager motoManager;

        static {
            try {
                bikeManager = new PropertiesManager("bike.properties");
                sportBikeManager = new PropertiesManager("sportbike.properties");
                motoManager = new PropertiesManager("moped.properties");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    public static MotorcycleParking createMotoWorld(int count, MotoWorld.Type... MotoWorldType) throws IOException {
            MotorcycleParking newMotorcycleParking = createmotorcycleParking();
            MotoWorld MotoWorld;
            for (int i = 0; i < count; i++) {
                String nameMotoWorld = MotoWorldType[r.nextInt(MotoWorldType.length)].name();

                switch (nameMotoWorld) {
                    case "bike": {
                        MotoWorld = createBike();
                        newMotorcycleParking.assembled_from_parts(MotoWorld);
                    }
                    break;
                    case "sportBike": {
                        MotoWorld = createSportBike();
                        newMotorcycleParking.assembled_from_parts(MotoWorld);

                    }
                    break;
                    case "moped": {
                        MotoWorld = createMoped();
                        newMotorcycleParking.assembled_from_parts(MotoWorld);
                    }
                    break;
                }
            }
            return newMotorcycleParking;

        }

    private static Moped createMoped() {
        MotoWorld.Sparepart sparepart = MotoWorld.Sparepart.values()[r.nextInt(MotoWorld.Sparepart.values().length)];
        int VOLTAGE=r.nextInt(motoManager.getIntProperty("VOLTAGE"));
        int STATE = r.nextInt(motoManager.getIntProperty("STATE"));
        int POWER = r.nextInt(motoManager.getIntProperty("POWER"));
        int price = r.nextInt(75);
        Moped moped = new Moped(VOLTAGE,STATE,POWER,perice);
        return moped;
    }

    private static SportBike createSportBike() {
        MotoWorld.Sparepart sparepart = MotoWorld.Sparepart.values()[r.nextInt(MotoWorld.Sparepart.values().length)];
        int HORSEPOWER = r.nextInt(sportBikeManager.getIntProperty("HORSEPOWER"));
        int MAXSPEED = r.nextInt(sportBikeManager.getIntProperty("MAXSPEED"));
        int price= r.nextInt(150)+80;
        SportBike sportbike = new SportBike(HORSEPOWER,MAXSPEED,price);
        return sportbike ;
    }

    private static Bike createBike() {
        MotoWorld.Sparepart sparepart = MotoWorld.Sparepart.values()[r.nextInt(MotoWorld.Sparepart.values().length)];
        Bike.Type type = Bike.Type.values()[r.nextInt(Bike.Type.values().length)];
        int OXIDATION = r.nextInt(bikeManager.getIntProperty("OXIDATION"));
        int TEMPERATURE = r.nextInt(bikeManager.getIntProperty("TEMPERATURE"));
        int price =r.nextInt(100)+90;
        Bike bike = new Bike(OXIDATION,TEMPERATURE,price);

        return bike ;

    }

    private static MotorcycleParking createmotorcycleParking() {
            int lenght = r.nextInt(100) + 1;
            int width = r.nextInt(100) + 1;

            MotorcycleParking motorcycleParking = new MotorcycleParking(lenght, width);
            return motorcycleParking;

        }
}


