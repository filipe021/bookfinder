package service;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import repository.CategoryRepository;

public class CategoryService {

	
	@Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    
    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }
    
    public Category save(Category category){
        return categoryRepository.save(category);
    }
    
    public void delete(Long id){
        categoryRepository.deleteById(id);
    }
}

