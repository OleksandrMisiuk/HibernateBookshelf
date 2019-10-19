package com.HibernateSimpleProject.repo;

import com.HibernateSimpleProject.domain.Bookshelf;
import org.springframework.data.repository.CrudRepository;

public interface BookshelfRepo extends CrudRepository<Bookshelf, Long> {
}
