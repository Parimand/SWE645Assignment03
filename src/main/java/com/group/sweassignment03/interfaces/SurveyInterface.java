package com.group.sweassignment03.interfaces;

import com.group.sweassignment03.DTO.PostStudentSurveyRequest;
import com.group.sweassignment03.model.Survey;
import jakarta.validation.Valid;

import java.util.List;

public interface SurveyInterface {
    Survey saveSurvey(PostStudentSurveyRequest postStudentSurveyRequest);
    List<Survey> getAllSurveys();
    Survey getSurveyById(Long id);

    Survey deleteSurveyById(Long id);

    Survey updateSurveyById(PostStudentSurveyRequest postStudentSurveyRequest,Long id);
}
