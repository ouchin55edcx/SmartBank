package com.ouchin.banksmart.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerSignleton {

    private EntityManagerSignleton() {
    }


    private static class SingletonHolder {
        private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("default");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return SingletonHolder.ENTITY_MANAGER_FACTORY;
    }

}
