package com.group.sweassignment03.mapper;

import com.group.sweassignment03.DTO.PostStudentSurveyRequest;
import com.group.sweassignment03.enums.LikedMostOption;
import com.group.sweassignment03.model.Survey;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper
public interface SurveyMapper {
    SurveyMapper INSTANCE = Mappers.getMapper(SurveyMapper.class);

    @Mapping(target = "dateOfSurvey", source = "dateOfSurvey", dateFormat = "yyyy-MM-dd")
    @Mapping(source = "likedMost", target = "likedMost",qualifiedByName = "mapLikedMost")
    Survey toEntity(PostStudentSurveyRequest surveyRequest, @MappingTarget Survey survey);



    @Named("mapLikedMost")
    static String mapLikedMost(List<LikedMostOption> likedMostOptions) {
        if(Objects.isNull(likedMostOptions) || CollectionUtils.isEmpty(likedMostOptions)){
            return null;
        }
        return likedMostOptions.stream()
                .map(LikedMostOption::name) // Convert each enum to its name
                .collect(Collectors.joining(",")); // Join with commas
    }
}
