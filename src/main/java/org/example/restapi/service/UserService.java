package org.example.restapi.service;

import org.example.restapi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}