package net.javaguides.springboot.repo;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book, Integer> {

	List<Book> findByName(String name);

	List<Book> findByPrice(double price);

	List<Book> findByQuantity(int quantity);

	

}
