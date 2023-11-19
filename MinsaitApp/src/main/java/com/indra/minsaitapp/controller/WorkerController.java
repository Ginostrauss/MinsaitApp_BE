package com.indra.minsaitapp.controller;

import com.indra.minsaitapp.entity.Worker;
import com.indra.minsaitapp.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers")
    public List<Worker> getAllWorkers() {
        List<Worker> workers = workerService.findAllWorkers();
        return workers;
    }

    @PostMapping("/add-workers")
    public List <Worker> addWorker(@RequestBody List<Worker> workers) {
        return workerService.saveAllWorker(workers);
    }
}