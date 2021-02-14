package com.example.mapstructdemo.web.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto extends BaseModel{
    private String firstName;
    private String lastName;
    private AddressDto address;

    @Builder
    public PersonDto(Long id, String firstName, String lastName, AddressDto address) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
