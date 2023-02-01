package com.chary.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chary.springboot.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
