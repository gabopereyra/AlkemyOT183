package com.alkemy.ong.service;

import com.alkemy.ong.dto.OrganizationDto;

public interface IOrganizationService {

    public Object getOrganizationPublicData();
    OrganizationDto getOrganizationDto(Long id);

}
