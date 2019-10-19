package com.HibernateSimpleProject.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "books")
    @JsonBackReference
    private List<Author> authors = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "bookshelf_id", referencedColumnName = "id")
    @JsonBackReference("bookshelf")
    private Bookshelf bookshelf;
}
