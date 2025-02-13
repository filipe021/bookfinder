package service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class GoogleBooksService {

	
	 private final String API_URL = "https://www.googleapis.com/books/v1/volumes?q=";

	    public String searchBooks(String query) {
	        RestTemplate restTemplate = new RestTemplate();
	        String url = API_URL + query.replace(" ", "+");
	        return restTemplate.getForObject(url, String.class);
	    }
	}
