package com.example.mapstructdemo.mappers;

import com.example.mapstructdemo.domain.Person;
import com.example.mapstructdemo.web.models.PersonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = AddressMapperImpl.class)
public interface PersonMapper {
//    @Mapping(source = "id", target = "id")
    Person personDtoToPerson(PersonDto personDto);
    PersonDto personToPersonDto(Person person);
}
