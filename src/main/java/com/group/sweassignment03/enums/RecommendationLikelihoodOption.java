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
