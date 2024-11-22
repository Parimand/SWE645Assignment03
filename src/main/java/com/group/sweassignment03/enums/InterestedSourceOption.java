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
