//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Service interface defining methods for survey operations like save, fetch, update, and delete.
// Promotes loose coupling by abstracting service implementation.

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
