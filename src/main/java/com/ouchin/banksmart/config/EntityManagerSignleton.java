package com.ouchin.banksmart.config;

import com.sun.source.tree.IfTree;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerSignleton {


    private static EntityManagerFactory ENTITY_MANAGER_FACTORY;
    private EntityManagerSignleton(){}

    public static EntityManagerFactory entityManagerFactory(){
        if (ENTITY_MANAGER_FACTORY == null){
            ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("banksmart");
        }
        return ENTITY_MANAGER_FACTORY;
    }

    public static void closeEntityManagerFactory() {
        if (ENTITY_MANAGER_FACTORY != null) {
            ENTITY_MANAGER_FACTORY.close();
        }
    }

}
