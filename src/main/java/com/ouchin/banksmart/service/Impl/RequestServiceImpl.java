package com.ouchin.banksmart.service.Impl;

import com.ouchin.banksmart.model.Request;
import com.ouchin.banksmart.repository.RequestRepository;
import com.ouchin.banksmart.service.RequestService;

public class RequestServiceImpl implements RequestService {
    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }
}
