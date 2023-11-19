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

    public List<Worker> saveAllWorker(List<Worker> workers) {
        return workerRepository.saveAll(workers);
    }

    public Worker findWorkerById(Long id) {
        Worker worker = workerRepository.findById(Math.toIntExact(id)).orElse(null);
        return worker;
    }

    public void deleteWorkerById(Long id) {
        workerRepository.deleteById(Math.toIntExact(id));
    }

    public Worker updateWorker(Worker worker) {
        Worker existingWorker = workerRepository.findById(worker.getMatricula()).orElse(null);
        existingWorker.setName(worker.getName());
        existingWorker.setSurname(worker.getSurname());
        return workerRepository.save(existingWorker);
    }
}
