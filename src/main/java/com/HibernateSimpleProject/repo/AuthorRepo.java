package com.HibernateSimpleProject.repo;

import com.HibernateSimpleProject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
