package com.ashan.user.service;

import com.ashan.user.dto.response.IUserResponse;
import com.ashan.user.dto.request.UserDTO;
import com.ashan.user.dto.response.UserDataResponseDTO;
import com.ashan.user.dto.response.UserSuccessResponseDTO;
import com.ashan.user.model.User;
import com.ashan.user.repository.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public UserService(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }


    public ResponseEntity<IUserResponse> addUser(UserDTO user) {
        userRepo.save(modelMapper.map(user, User.class));
        return ResponseEntity.status(201).body(UserSuccessResponseDTO.builder().message("User added successfully").build());
    }
    public ResponseEntity<IUserResponse> getUsers() {
        List<User> users = userRepo.findAll();
        return ResponseEntity.ok(UserDataResponseDTO.builder().data(users).build());
    }
    public ResponseEntity<IUserResponse> getUserByEmail(String email) {
        User user = userRepo.findByEmail(email);
        return ResponseEntity.ok(UserDataResponseDTO.builder().data(user).build());
    }
}
