//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Enum defining the features participants liked most in the survey.
// It ensures consistent and structured feedback options for "Liked Most".


package com.group.sweassignment03.enums;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum LikedMostOption {
    Students("Students"),
    Location("Location"),
    Campus("Campus"),
    Atmosphere("Atmosphere"),
    DormRooms("Dorm Rooms"),
    Sports("Sports");

    private final String description;

    LikedMostOption(String description) {
        this.description = description;
    }

}
