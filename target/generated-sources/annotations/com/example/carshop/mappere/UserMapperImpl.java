package com.example.carshop.mappere;

import com.example.carshop.DTO.UserDTO;
import com.example.carshop.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-13T14:27:43+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User DTOToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        return user;
    }

    @Override
    public UserDTO entityToDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        return userDTO;
    }

    @Override
    public List<UserDTO> entitiesToDTOS(List<User> all) {
        if ( all == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( all.size() );
        for ( User user : all ) {
            list.add( entityToDTO( user ) );
        }

        return list;
    }
}
