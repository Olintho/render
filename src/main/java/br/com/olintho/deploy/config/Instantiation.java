package br.com.olintho.deploy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.olintho.deploy.books.Book;
import br.com.olintho.deploy.books.BooksRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private BooksRepository booksRepository;

	@Override
	public void run(String... args) throws Exception {

			
			booksRepository.deleteAll();

			Book book1 = new Book("200000",  "The book guide", "Read the book");
			Book book2 = new Book("200001", "Java Man, the definitive guide aboit java developers", "Java Man");
			Book book3 = new Book("200002",  "Escrito por uma das maiores referências da programação, Barry Burd, o Java Para Leigos, Tradução da 5ª Edição, traz informações atualizadas sobre linguagens de programação, o básico da programação", "Java para leigos");
			Book book4 = new Book("200003", "Java: Como Programar", "Java: Como Programar");
			Book book5 = new Book("200004", "Use a Cabeça! Java é uma experiência completa de aprendizado em programação orientada a objetos (OO) e Java. Projetado de acordo com princípios de aprendizado simples, este livro mostrará de aspectos", "Use a Cabeça");

			booksRepository.saveAll(Arrays.asList(book1, book2, book3, book4, book5));
		
			
	}

}
