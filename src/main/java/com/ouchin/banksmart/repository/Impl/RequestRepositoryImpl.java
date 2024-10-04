package com.ouchin.banksmart.repository.Impl;

import com.ouchin.banksmart.config.EntityManagerSignleton;
import com.ouchin.banksmart.model.Request;
import com.ouchin.banksmart.repository.RequestRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;

import java.util.List;
import java.util.Optional;

public class RequestRepositoryImpl implements RequestRepository {

    @Override
    public Request save(Request request) {
        EntityManager em = EntityManagerSignleton.entityManagerFactory().createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(request);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        }finally {
            em.close();
        }
        return request;
    }

    @Override
    public Optional<Request> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Request> findAll() {
        return List.of();
    }

    @Override
    public void update(Request request) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Request> findByStatus() {
        return List.of();
    }

    @Override
    public List<Request> findByDate() {
        return List.of();
    }
}
