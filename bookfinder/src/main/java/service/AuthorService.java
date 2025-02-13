package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Author;
import repository.AuthorRepository;

@Service
public class AuthorService {
	
	
	@Autowired
    private AuthorRepository authorRepository;
    
    public List<Author> findAll(){
        return authorRepository.findAll();
    }
    
    public Optional<Author> findById(Long id){
        return authorRepository.findById(id);
    }
    
    public Author save(Author author){
        return authorRepository.save(author);
    }
    
    public void delete(Long id){
        authorRepository.deleteById(id);
    }
    
    public List<Author> searchByName(String name){
        return authorRepository.findByNameContainingIgnoreCase(name);
    }
}


