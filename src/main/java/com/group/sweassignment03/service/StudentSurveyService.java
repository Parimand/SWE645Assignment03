package com.group.sweassignment03.service;

import com.group.sweassignment03.DTO.PostStudentSurveyRequest;
import com.group.sweassignment03.exceptions.ResourceNotFoundException;
import com.group.sweassignment03.interfaces.SurveyInterface;
import com.group.sweassignment03.mapper.SurveyMapper;
import com.group.sweassignment03.model.Survey;
import com.group.sweassignment03.repository.SurveyRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StudentSurveyService implements SurveyInterface {
    private final SurveyRepository surveyRepository;

    public StudentSurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Override
    public Survey saveSurvey(@Valid PostStudentSurveyRequest postStudentSurveyRequest) {
        Survey survey = SurveyMapper.INSTANCE.toEntity(postStudentSurveyRequest,new Survey());
        return surveyRepository.save(survey);
    }

    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey getSurveyById(Long id) {

        return surveyRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Survey","ID",id));

    }

    @Override
    public Survey deleteSurveyById(Long id) {
        Survey survey= surveyRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Survey","ID",id));
        surveyRepository.deleteById(id);
        return survey;
    }

    @Override
    public Survey updateSurveyById(@Valid PostStudentSurveyRequest postStudentSurveyRequest, Long id) {
        Survey survey= surveyRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Survey","ID",id));
         surveyRepository.save(SurveyMapper.INSTANCE.toEntity(postStudentSurveyRequest,survey));
        return survey;
    }
}
