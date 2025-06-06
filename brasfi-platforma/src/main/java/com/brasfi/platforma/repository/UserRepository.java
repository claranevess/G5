package com.brasfi.platforma.repository;

import com.brasfi.platforma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByTelefone(String telefone);
    Optional<User> findById(Long id);
}
