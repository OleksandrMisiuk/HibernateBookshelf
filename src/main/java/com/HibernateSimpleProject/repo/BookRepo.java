package com.HibernateSimpleProject.repo;

import com.HibernateSimpleProject.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Long> {
    List<Book> findBookByBookshelf_Id(Long id);
}
