package io.github.donraphael014.FlashMsg.repository;

import io.github.donraphael014.FlashMsg.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    List<User> findByIsOnlineTrue();
    boolean existsByUsername(String username);
}