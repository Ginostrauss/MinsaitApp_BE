package com.indra.minsaitapp.controller;

import com.indra.minsaitapp.entity.Worker;
import com.indra.minsaitapp.service.WorkerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @ApiOperation(value = "Get an example item")
    @GetMapping("/workers")
    public List<Worker> getAllWorkers() {
        List<Worker> workers = workerService.findAllWorkers();
        return workers;
    }

    @GetMapping("/workers/{id}")
    public Worker getWorkerById(@PathVariable Long id) {
        Worker worker = workerService.findWorkerById(id);
        return worker;
    }

    @DeleteMapping("/workers/{id}")
    public String deleteWorkerById(@PathVariable Long id) {
        workerService.deleteWorkerById(id);
        return "Worker removed with id: " + id;
    }

    @PutMapping("/workers")
    public Worker updateWorker(@RequestBody Worker worker) {
        Worker updatedWorker = workerService.updateWorker(worker);
        return updatedWorker;
    }

    @PostMapping("/add-workers")
    public List <Worker> addWorker(@RequestBody List<Worker> workers) {
        return workerService.saveAllWorker(workers);
    }


}
