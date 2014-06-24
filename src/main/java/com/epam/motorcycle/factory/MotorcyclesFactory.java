package com.epam.motorcycle.factory;

import com.epam.motorcycle.entity.MotoWorld;
import com.epam.motorcycle.entity.MotorcycleParking;
import com.epam.motorcycle.util.PropertiesManager;


import java.io.*;
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
            MotoWorld MoroWorld;
            for (int i = 0; i < count; i++) {
                String nameMotoWorld = MotoWorldType[r.nextInt(MotoWorldType.length)].name();

                switch (nameMotoWorld) {
                    case "bike": {
                        MoroWorld = createBike();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);
                    }
                    break;
                    case "sportBike": {
                        MoroWorld = createSportBike();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);

                    }
                    break;
                    case "moto": {
                        MoroWorld = createSportBike();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);
                    }
                    break;
                }
            }
            return newMotorcycleParking;

        }

    private static MotoWorld createSportBike() {
    }

    private static MotoWorld createBike() {
    }

    private static MotorcycleParking createmotorcycleParking() {
            int lenght = r.nextInt(100) + 1;
            int width = r.nextInt(100) + 1;

            MotorcycleParking motorcycleParking = new MotorcycleParking(lenght, width);
            return motorcycleParking;

        }
}


