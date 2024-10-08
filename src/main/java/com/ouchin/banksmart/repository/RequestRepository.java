package com.ouchin.banksmart.repository;

import com.ouchin.banksmart.model.Request;

import java.util.List;
import java.util.Optional;

public interface RequestRepository {

    Request save(Request request);
    Optional<Request> findById(Long id);
    List<Request> findAll();
    void update(Request request);
    void delete(Long id);
    List<Request> findByStatus();
    List<Request> findByDate();



}
