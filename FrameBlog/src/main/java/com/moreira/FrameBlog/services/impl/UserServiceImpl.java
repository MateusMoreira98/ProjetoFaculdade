package com.moreira.FrameBlog.services.impl;

import com.moreira.FrameBlog.models.User;
import com.moreira.FrameBlog.repositories.UserRepository;
import com.moreira.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user) {
       User existingUser = userRepository.findByUsername(user.getName());
       if (Objects.nonNull(existingUser != null)) {
           throw  new RuntimeException("Existing user already exists");
       }
       User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getPassaword(), user.getRole());
       User newUser = userRepository.save(entity);
       return new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getPassaword(), newUser.getRole());
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User update(Long id, User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
