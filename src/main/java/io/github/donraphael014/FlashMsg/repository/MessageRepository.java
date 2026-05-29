package io.github.donraphael014.FlashMsg.repository;

import io.github.donraphael014.FlashMsg.entites.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findTop50ByOrderByTimestampDesc();
    List<Message> findAllByOrderByTimestampAsc();
}