package com.alkemy.ong.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Builder
public class OrganizationDetailedDto {

    private Long id;
    private String name;
    private String image;
    private String address;
    private String phone;
    private String email;
    private String welcomeText;
    private String aboutUsText;
    private LocalDate created;
    private LocalDate updated;
    private String facebook;
    private String instagram;
    private String linkedin;

}
