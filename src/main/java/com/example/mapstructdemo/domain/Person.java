package com.example.mapstructdemo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;
    private Address address;
    @Builder
    public Person(Long id, String firstName, String lastName, Address address) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
