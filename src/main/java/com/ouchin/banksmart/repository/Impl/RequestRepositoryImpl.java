package com.ouchin.banksmart.repository.Impl;

import com.ouchin.banksmart.model.Request;
import com.ouchin.banksmart.repository.RequestRepository;

import java.util.List;
import java.util.Optional;

public class RequestRepositoryImpl implements RequestRepository {

    @Override
    public Request save(Request request) {
        return null;
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
