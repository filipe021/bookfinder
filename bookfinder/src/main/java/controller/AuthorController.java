package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Author;
import service.AuthorService;


@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	
	@Autowired
    private AuthorService authorService;
    
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id){
        return authorService.findById(id);
    }
    
    @PostMapping
    public Author createAuthor(@RequestBody Author author){
        return authorService.save(author);
    }
    
    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Long id, @RequestBody Author author){
        author.setId(id);
        return authorService.save(author);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.delete(id);
    }
    
    // Endpoint para busca por nome
    @GetMapping("/search")
    public List<Author> searchAuthors(@RequestParam("name") String name){
        return authorService.searchByName(name);
    }
}

