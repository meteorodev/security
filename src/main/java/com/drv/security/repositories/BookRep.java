package com.drv.security.repositories;

import com.drv.security.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRep extends JpaRepository<Book,Long> {

}
