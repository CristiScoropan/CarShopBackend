package com.example.carshop.Service;

import com.example.carshop.DTO.UserDTO;
import com.example.carshop.entity.Anunt;
import com.example.carshop.entity.User;
import com.example.carshop.mappere.UserMapper;
import com.example.carshop.repository.AnuntRepo;
import com.example.carshop.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    private final UserMapper userMapper;
    private final UserRepo UserRepo;

    public UserService(UserMapper userMapper, UserRepo UserRepo) {
        this.userMapper = userMapper;
        this.UserRepo = UserRepo;
    }

    public UserDTO createUser(UserDTO userDTO){
        return userMapper.entityToDTO(UserRepo.save(userMapper.DTOToEntity(userDTO)));
    }

    public List<UserDTO> findAll(){
        return userMapper.entitiesToDTOS(UserRepo.findAll());
    }

    public UserDTO compareUser(UserDTO userDTO){
        User user = UserRepo.findUserByName(userDTO.getName());
        if(user!= null && user.getPassword().equals(userDTO.getPassword())){
            return userMapper.entityToDTO(user);
        } else {
            return null;
        }
    }

    public UserDTO changePassword(UserDTO userDTO){
        User user = UserRepo.findUserByName(userDTO.getName());

        if(user != null){
            user.setPassword(userDTO.getPassword());
            UserRepo.save(user);
            return userMapper.entityToDTO(user);
        } else {
            return null;
        }
    }
}