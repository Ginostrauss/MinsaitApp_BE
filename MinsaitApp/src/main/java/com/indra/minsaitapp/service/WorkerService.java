package com.indra.minsaitapp.service;

import com.indra.minsaitapp.entity.Worker;

import java.util.List;

public interface WorkerService {

    public List<Worker> findAllWorkers();

    public Worker findWorkerById(Long id);

    public List<Worker> saveAllWorker(List<Worker> workers);

    public void deleteWorkerById(Long id);

    public Worker updateWorker(Worker worker);


}
