package com.pentagono.pentagono.service;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.model.Enterprise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean("categoryMapper")
    public ModelMapper categoryMapper() {
        ModelMapper mapper = new ModelMapper();
        TypeMap<EnterpriseDTO, Enterprise> typeMap = mapper.createTypeMap(EnterpriseDTO.class, Enterprise.class);
        typeMap.addMapping(EnterpriseDTO::getIdEnterprise, nameEnterprise::setIdEnterprise);
        typeMap.addMapping(EnterpriseDTO::getNameEnterprise, Enterprise::setNameEnterprise);
        typeMap.addMapping(EnterpriseDTO::getDocumentEnterprise, Enterprise::setDocumentEnterprise);
        typeMap.addMapping(EnterpriseDTO::isEnabledEnterprise, Enterprise::setEnabled);
        return mapper;
    }

    @Bean("employeeMapper")
    public ModelMapper productMapper() {
        return null;
    }
}
