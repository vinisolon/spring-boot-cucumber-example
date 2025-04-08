package org.vinisolon.cucumber.example.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.vinisolon.cucumber.example.app.dto.MyRequest;
import org.vinisolon.cucumber.example.app.dto.MyResponse;
import org.vinisolon.cucumber.example.app.entity.MyEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MyMapper {

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    MyEntity from(MyRequest request);

    MyResponse from(MyEntity entity);

}
