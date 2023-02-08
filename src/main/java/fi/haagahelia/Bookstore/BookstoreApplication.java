package fi.haagahelia.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.Bookstore.domain.Book;
import fi.haagahelia.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book book1 = new Book("Retkimatkat", "Johnson", "somerandom", 1999, 19.99);
			Book book2 = new Book("Menovehkeet", "Johnson", "somerandom", 1999, 19.99);
			
			repository.save(book1);
			repository.save(book2);
		};
	}
}
