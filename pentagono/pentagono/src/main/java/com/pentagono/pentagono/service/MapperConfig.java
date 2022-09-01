package com.pentagono.pentagono.service;/*Jessica 1sept*/

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.model.Enterprise;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean("enterpriseMapper")
    public ModelMapper enterpriseMapper() {
        ModelMapper mapper = new ModelMapper();
        TypeMap<EnterpriseDTO, Enterprise> typeMap = mapper.createTypeMap(EnterpriseDTO.class,Enterprise.class);
        typeMap.addMapping(EnterpriseDTO::getIdEnterprise, Enterprise::setIdEnterprise);
        typeMap.addMapping(EnterpriseDTO::getName, Enterprise::setName);
        typeMap.addMapping(EnterpriseDTO::getDocument, Enterprise::setDocument);
        typeMap.addMapping(EnterpriseDTO::getPhone, Enterprise::setPhone);
        typeMap.addMapping(EnterpriseDTO::getAddress, Enterprise::setAddress);
        typeMap.addMapping(EnterpriseDTO::isEnabledEnterprise, Enterprise::setEnabled);
        return mapper;
    }

    @Bean("employeeMapper")
    public ModelMapper employeeMapper() {
        return new ModelMapper();
    }
    @Bean("transactionMapper")
    public ModelMapper transactionMapper() {
        return null;
    }
}
