package com.example.springBootLab.DAO;

import com.example.springBootLab.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {

}
