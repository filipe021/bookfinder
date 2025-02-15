package service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.BookRepository;

@Service
public class BookService {

	
	@Autowired
    private BookRepository bookRepository;
    
    public List<Book> findAll(){
        return bookRepository.findAll(); 
    }
    
    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }
    
    public Book save(Book book){
        return bookRepository.save(book);
    }
    
    public void delete(Long id){
        bookRepository.deleteById(id);
    }
    
    public List<Book> searchByTitle(String title){
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }
}

