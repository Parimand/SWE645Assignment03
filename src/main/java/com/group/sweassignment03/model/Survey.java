//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Entity class representing the studentsurvey table in the database.
// It maps survey data fields to database columns and supports enum-based storage for specific fields.


package com.group.sweassignment03.model;

import com.group.sweassignment03.enums.InterestedSourceOption;
import com.group.sweassignment03.enums.LikedMostOption;
import com.group.sweassignment03.enums.RecommendationLikelihoodOption;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Table(name = "studentsurvey")
public class Survey {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "street_address")
        private String streetAddress;

        @Column(name = "city")
        private String city;

        @Column(name = "state")
        private String state;

        @Column(name = "zip")
        private String zip;

        @Column(name = "telephone_number")
        private String telephoneNumber;

        @Column(name = "email")
        private String email;

        @Column(name = "date_of_survey")
        private LocalDate dateOfSurvey;

        @Column(name = "liked_most")
        private String likedMost;

        @Enumerated(EnumType.STRING)
        @Column(name = "interested_source")
        private InterestedSourceOption interestedSource;

        @Enumerated(EnumType.STRING)
        @Column(name = "recommendation_likelihood")
        private RecommendationLikelihoodOption recommendationLikelihood;

}

