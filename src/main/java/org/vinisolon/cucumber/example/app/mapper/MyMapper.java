package org.vinisolon.cucumber.example.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.vinisolon.cucumber.example.app.entity.MyEntity;
import org.vinisolon.cucumber.example.app.rest.dto.MyRequest;
import org.vinisolon.cucumber.example.app.rest.dto.MyResponse;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MyMapper {

    MyEntity from(MyRequest request);

    MyResponse from(MyEntity entity);

}
