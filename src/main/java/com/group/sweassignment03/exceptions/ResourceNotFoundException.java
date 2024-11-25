//Group Details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri G01464737
// Nemali Sudheer Reddy G01410008
// Gunnampalli Datta Naga Vamseedhar G01478792

// Custom exception class for handling cases where a resource is not found.
// It provides detailed error information, such as the missing resource and its identifier.

package com.group.sweassignment03.exceptions;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{
    private final String resourceName;
    private final String fieldName;
    private final Object fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s: %s", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
