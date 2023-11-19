package com.indra.minsaitapp.service;

import com.indra.minsaitapp.entity.Worker;
import com.indra.minsaitapp.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public List<Worker> findAllWorkers() {
        return workerRepository.findAll();
    }
}
