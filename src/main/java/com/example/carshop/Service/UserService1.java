package com.example.carshop.Service;

import com.example.carshop.DTO.UserDTO;
import com.example.carshop.entity.User;
import com.example.carshop.mappere.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.carshop.repository.UserRepository;

import java.util.List;

@Service

public class UserService1 {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService1(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO){
        return userMapper.entityToDTO(userRepository.save(userMapper.DTOToEntity(userDTO)));
    }

    public List<UserDTO> findAll(){
        return userMapper.entitiesToDTOS(userRepository.findAll());
    }

    public UserDTO compareUser(UserDTO userDTO){
        User user = userRepository.findByName(userDTO.getName());
        if(user!= null && user.getPassword().equals(userDTO.getPassword())){
            return userMapper.entityToDTO(user);
        } else {
            return null;
        }
    }

    public UserDTO changePassword(UserDTO userDTO){
        User user = userRepository.findByName(userDTO.getName());

        if(user != null){
            user.setPassword(userDTO.getPassword());
            userRepository.save(user);
            return userMapper.entityToDTO(user);
        } else {
            return null;
        }
    }
}
