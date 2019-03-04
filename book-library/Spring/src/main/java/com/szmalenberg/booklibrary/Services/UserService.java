package com.szmalenberg.booklibrary.Services;

import com.szmalenberg.booklibrary.domain.Role;
import com.szmalenberg.booklibrary.domain.User;
import com.szmalenberg.booklibrary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

@Transactional
    public void createUser(String username, String password) {
        if (username != null && password != null) {
            User user = userRepository.getUser(username);

            if (user == null) {
                User newUser = new User(username, password);
                userRepository.addUser(newUser);
            }
        }
    }
    @Transactional
    public void addRoleToUser(String username, String rolename) {
        if (username != null && rolename != null) {
            User user = userRepository.getUser(username);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+ user.getRoles()==null);

            if (user != null) {
                Role role = new Role(rolename);
                userRepository.addRoleToUser(user, role);
            }
        }
    }
}
