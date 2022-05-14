package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDAO;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public Role getRole(String userRole) {
        return roleDAO.getRole(userRole);
    }

    public List<Role> getAllRole() {
        return roleDAO.getAllRole();
    }
}