package com.project.vets4pets.appointment.api.service;
import com.project.vets4pets.appointment.domain.entity.User;

public interface UserService {
    User findByEmail(String email);
    Boolean existsByEmail(String email);
    void save(User user);
    void delete(User user);
}