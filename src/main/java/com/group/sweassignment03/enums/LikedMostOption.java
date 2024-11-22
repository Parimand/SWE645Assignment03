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
