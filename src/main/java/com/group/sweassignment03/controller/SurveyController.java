package com.group.sweassignment03.controller;

import java.util.List;

import com.group.sweassignment03.DTO.PostStudentSurveyRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.group.sweassignment03.interfaces.SurveyInterface;
import com.group.sweassignment03.model.Survey;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SurveyController {

    private final SurveyInterface surveyService;

    public SurveyController(SurveyInterface surveyInterface) {
        this.surveyService = surveyInterface;
    }

    @PostMapping("/survey")
    public ResponseEntity<Survey> saveSurvey(@Valid @RequestBody PostStudentSurveyRequest postStudentSurveyRequest) {
        return new ResponseEntity<>(surveyService.saveSurvey(postStudentSurveyRequest), HttpStatus.CREATED);

    }

    @GetMapping("/survey")
    public List<Survey> getAllSurveys(){
        return surveyService.getAllSurveys();

    }

    @GetMapping("/survey/{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable("id") Long id){
        return new ResponseEntity<>(surveyService.getSurveyById(id), HttpStatus.OK);

    }

    @DeleteMapping("/survey/{id}")
    public ResponseEntity<Survey> deleteSurveyById(@PathVariable("id") Long id){
        return new ResponseEntity<>(surveyService.deleteSurveyById(id), HttpStatus.OK);

    }

    @PutMapping("/survey/{id}")
    public ResponseEntity<Survey> updateSurveyById(@Valid @RequestBody PostStudentSurveyRequest postStudentSurveyRequest,@PathVariable("id") Long id){
        return new ResponseEntity<>(surveyService.updateSurveyById(postStudentSurveyRequest, id), HttpStatus.OK);

    }


}
