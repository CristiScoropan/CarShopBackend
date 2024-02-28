package com.example.carshop.mappere;

import com.example.carshop.DTO.UserDTO;
import com.example.carshop.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User DTOToEntity (UserDTO userDTO);
    UserDTO entityToDTO (User user);

    List<UserDTO> entitiesToDTOS(List<User> all);
}
