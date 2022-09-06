package com.pentagono.pentagono2.service;

import com.pentagono.pentagono2.dto.EnterpriseDTO;
import com.pentagono.pentagono2.model.Enterprise;
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
        typeMap.addMapping(EnterpriseDTO::getNit, Enterprise::setNit);
        typeMap.addMapping(EnterpriseDTO::getPhone, Enterprise::setPhone);
        typeMap.addMapping(EnterpriseDTO::getAddress, Enterprise::setAddress);
        typeMap.addMapping(EnterpriseDTO::isEnabled, Enterprise::setEnabled);
        return mapper;
    }

    /*@Bean("employeeMapper")
    public ModelMapper employeeMapper() {
        return new ModelMapper();
    }*/
}
