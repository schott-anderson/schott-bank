package com.bank.schott.schott_bank.controller.mapper;

import com.bank.schott.schott_bank.controller.dtocreate.UserCreateDto;
import com.bank.schott.schott_bank.controller.dtoresponse.UserResponseDto;
import com.bank.schott.schott_bank.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper mapper;

    public User toEntity (UserCreateDto dto){
        User entity = mapper.map(dto, User.class);
        return entity;
    }

    public UserResponseDto toDTO(User entity){
        UserResponseDto dto = mapper.map(entity, UserResponseDto.class);
        return dto;
    }

    public List<UserResponseDto> toDTO (List<User> users){
        return users.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

}
