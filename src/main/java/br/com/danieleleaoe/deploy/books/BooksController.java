package br.com.danieleleaoe.deploy.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/")
//    public ResponseEntity<List<Book>> list() {
    public List<Book> list() {
    	List<Book> lista = this.booksRepository.findAll(); 
        return  lista;
    }

    @GetMapping("/search")
    public @ResponseBody List<Book> pesquisar(String nome) {
		return  this.booksRepository.findAll();
	}
    
    @PostMapping("/")
    public Book create(@RequestBody Book book) {
        return this.booksRepository.save(book);
    }

}
