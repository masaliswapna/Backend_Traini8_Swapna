
package com.traini8.training_center_registry.controller;

import com.traini8.training_center_registry.model.TrainingCenter;

import com.traini8.training_center_registry.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping ("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Validated @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = trainingCenterService.getAllTrainingCenters();
        return new ResponseEntity<>(trainingCenters, HttpStatus.OK);
    }
}

