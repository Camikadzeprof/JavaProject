package com.example.artem.service;

import com.example.artem.entity.Roles;
import com.example.artem.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    public Optional<Roles> GetById(Long id) {
        return rolesRepository.findById(id);
    }

    public List<Roles> getAll() {
        return rolesRepository.findAll();
    }

    public Roles findByName(String name) {
        return rolesRepository.findByName(name);
    }
}
