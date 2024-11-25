//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// REST controller to handle survey-related API endpoints (CRUD operations).
// It interacts with the service layer to process requests and return responses.


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
