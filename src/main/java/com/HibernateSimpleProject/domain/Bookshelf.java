package com.HibernateSimpleProject.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Bookshelf")
public class Bookshelf {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "bookshelf",  fetch = FetchType.LAZY)
    @JsonManagedReference("bookshelf")
    private List<Book> books = new ArrayList<>();
}
