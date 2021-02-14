package com.example.mapstructdemo.web.models;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private String street;
    private String stateOrProvince;
}
