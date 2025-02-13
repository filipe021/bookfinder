package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Category {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    
    // Relacionamento One-to-Many com Book
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Book> books;
    
    
    public Category(Long id, String name, String description, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.books = books;
	}


	// Construtores, getters e setters

    public Category() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}

    
    
    // Getters e setters...
}

