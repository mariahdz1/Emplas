package com.pentagono.pentagono;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.model.Enterprise;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean("enterpriseMapper")
    public ModelMapper enterpriseMapper(){
        ModelMapper mapper = new ModelMapper();
        TypeMap<EnterpriseDTO, Enterprise> typeMap = mapper.createTypeMap(EnterpriseDTO.class,Enterprise.class);
        typeMap.addMapping(EnterpriseDTO::getIdEnterprise, Enterprise::setIdEnterprise);
        typeMap.addMapping(EnterpriseDTO::getName, Enterprise::setName);
        return mapper;
    }

    @Bean("employeeMapper")
    public ModelMapper employeeMapper(){
        return new ModelMapper();
    }

    @Bean("transactionMapper")
    public ModelMapper transactionMapper(){ return new ModelMapper();}

    @Bean("userInfoMapper")
    public ModelMapper userInfoMapper(){ return new ModelMapper();}


}
