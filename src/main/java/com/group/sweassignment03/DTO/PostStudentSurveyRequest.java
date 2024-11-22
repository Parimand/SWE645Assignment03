package com.group.sweassignment03.DTO;

import com.group.sweassignment03.enums.InterestedSourceOption;
import com.group.sweassignment03.enums.LikedMostOption;
import com.group.sweassignment03.enums.RecommendationLikelihoodOption;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PostStudentSurveyRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Street address is required")
    private String streetAddress;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Zip code is required")
    private String zip;

    @NotBlank(message = "Telephone number is required")
    @Pattern(regexp = "^\\d{10}$",message = "Telephone number must be exactly 10 digits")
    private String telephoneNumber;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Date of survey is required")
    private LocalDate dateOfSurvey;

    private List<LikedMostOption> likedMost;

    private InterestedSourceOption interestedSource;


    private RecommendationLikelihoodOption recommendationLikelihood;
}
