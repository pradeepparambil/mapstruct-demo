package com.example.mapstructdemo.mappers;

import com.example.mapstructdemo.domain.Address;
import com.example.mapstructdemo.web.models.AddressDto;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    Address addressDtoToAddress(AddressDto addressDto);
    AddressDto addressToAddressDto(Address address);


}
