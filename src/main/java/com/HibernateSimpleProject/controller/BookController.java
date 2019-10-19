package com.HibernateSimpleProject.controller;

import com.HibernateSimpleProject.domain.Book;
import com.HibernateSimpleProject.repo.AuthorRepo;
import com.HibernateSimpleProject.repo.BookRepo;
import com.HibernateSimpleProject.repo.BookshelfRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    BookRepo bookRepo;

    @Autowired
    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    @PostMapping(value = "/create")
    public Book createBook(@RequestBody Book book){
       return bookRepo.save(book);
    }

    @PutMapping(value = "/update")
    public Book updateBook(@RequestBody Book book){
        return  bookRepo.save(book);
    }

    @DeleteMapping(value = "/delete")
    public void deleteBook(@RequestParam Long id){
        bookRepo.deleteById(id);
    }

    @GetMapping(value = "/find")
    public Optional<Book> findBook(@RequestParam Long id){
        return bookRepo.findById(id);
    }

    @GetMapping("/findByBookshelfId")
    public List<Book> findByBookshelfId(@RequestParam Long id) {
        return bookRepo.findBookByBookshelf_Id(id);
    }
}
