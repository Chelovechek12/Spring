package com.example.demo.service;
import com.example.demo.controller.BookController;
import com.example.demo.entity.BookEntity;
import org.springframework.stereotype.Service;
import com.example.demo.repo.BookRepo;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepo repo;
    public BookController deleteById;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }
    public void save( BookEntity book) {repo.save(book);}
    public void delete(Long id){repo.deleteById(id);}
    public Optional<BookEntity> byId(Long id){
        return  repo.findById(id);
    }
    public Iterable<BookEntity> getAll() { return repo.findAll();}
}

