//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Enum defining the possible sources of interest in the survey.
// It standardizes inputs for "Interested Source" to predefined values.


package com.group.sweassignment03.enums;

import lombok.Getter;

@Getter
public enum InterestedSourceOption {
    Friends("Friends"),
    Television("Television"),
    Internet("Internet"),
    Other("Other");

    private final String description;

    InterestedSourceOption(String description) {
        this.description = description;
    }
}
