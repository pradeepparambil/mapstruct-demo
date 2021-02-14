package com.example.mapstructdemo.domain;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private Address address;

}
