//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Enum defining the likelihood of participants recommending the subject.
// It standardizes feedback into predefined likelihood levels.


package com.group.sweassignment03.enums;

import lombok.Getter;

@Getter
public enum RecommendationLikelihoodOption {
    VeryLikely("Very Likely"),
    Likely("Likely"),
    Unlikely("Unlikely");

    private final String description;

    RecommendationLikelihoodOption(String description) {
        this.description = description;
    }
}
