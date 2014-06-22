package com.epam.motorcycle.factory;

import com.epam.motorcycles.l.entity.MotoWorld;
import com.epam.motorcycles.l.entity.MotorcycleParking;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;

import java.io.*;
import  java.util.*;
public class Plant_Motorcycles {
    private final static Random r = new Random() {
        private static PropertyManager bikeManager;
        private static PropertyManager sportBikeManager;
        private static PropertyManager motoManager;

        static {
            try {
                bikeManager = new PropertyManager( "bike.benefits");
                sportBikeManager = new PropertyManager("sportBike.benefis");
                motoManager = new PropertyManager("Moped.benefit");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        public static MotorcycleParking createMotoWorld(int count,MotoWorld.Type...moto_worldType)throws  IOException{
            MotorcycleParking newMotorcycleParking = createMotorcycleParking();
            MotoWorld MoroWorld;
            for (int i=0;i<count;i++){
                String namemoto_world =moto_worldType[r.nextInt(moto_worldType.length)].name();

                switch (namemoto_world){
                    case  "bike":{
                        MoroWorld=createMotoWorld();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);
                    }
                    break;
                    case "sportBike":{
                        MoroWorld=createMotoWorld();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);

                    }
                    break;
                    case "moto":{
                        MoroWorld=createMotoWorld();
                        newMotorcycleParking.assembled_from_parts(MoroWorld);
                    }
                    break;
                }
            }
            return newMotorcycleParking;

        }

        private static MotorcycleParking createmotorcycleParking() {/////////??????????
            int lenght = r.nextInt(100)+1;
            int width = r.nextInt(100)+1;
            ;
            MotorcycleParking motorcycleParking = new MotorcycleParking(lenght,width);
            return motorcycleParking;

        }

    }

}