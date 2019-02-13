package com.example.wulghashSpringApp.repos;

import com.example.wulghashSpringApp.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);


}
