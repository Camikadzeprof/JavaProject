package com.example.artem.repository;

import com.example.artem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByLogin(String login);

    Users findByActivationCode(String code);
}
