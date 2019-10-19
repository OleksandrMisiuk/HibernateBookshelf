package com.HibernateSimpleProject.controller;

import com.HibernateSimpleProject.domain.Author;
import com.HibernateSimpleProject.repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {
    AuthorRepo authorRepo;

    @Autowired
    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @PostMapping(value = "/create")
    public Author createAuthor(@RequestBody Author author){
        return authorRepo.save(author);
    }

    @PutMapping(value = "/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorRepo.save(author);
    }

    @DeleteMapping(value = "/delete")
    public void deleteAuthor(@RequestParam Long id){
        authorRepo.deleteById(id);
    }

    @GetMapping(value = "/find")
    public Optional<Author> findAuthor(@RequestParam Long id){
        return authorRepo.findById(id);
    }
}
