package com.HibernateSimpleProject.controller;

import com.HibernateSimpleProject.domain.Bookshelf;
import com.HibernateSimpleProject.repo.BookshelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/bookshelf")
public class BookshelfController {
    BookshelfRepo bookshelfRepo;

    @Autowired
    BookshelfController(BookshelfRepo bookshelfRepo){
        this.bookshelfRepo = bookshelfRepo;
    }

    @PostMapping(value = "/create")
    public Bookshelf createBookshelf(@RequestBody Bookshelf bookshelf){
        return bookshelfRepo.save(bookshelf);
    }

    @PutMapping(value = "/update")
    public Bookshelf updateBookshelf(@RequestBody Bookshelf bookshelf){
        return bookshelfRepo.save(bookshelf);
    }

    @DeleteMapping(value = "/delete")
    public void deleteBookshelf(@RequestParam Long id){
        bookshelfRepo.deleteById(id);
    }

    @GetMapping(value = "/find")
    public Optional<Bookshelf> findBookshelf(@RequestParam Long id){
        return bookshelfRepo.findById(id);
    }
}
