package net.javaguides.springboot.controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repo.BookRepo;
import net.javaguides.springboot.repo.UserRepo;




@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	 UserRepo repo;
	
	@Autowired
	BookRepo brepo;
	
	@GetMapping("/")
	public List<User> showUser()
	{
		//return all the value from the tables
	   return repo.findAll();
		
	}
	
	@PostMapping("/")
	public User postUser(@RequestBody User  user)
	{
		List<Book>book=new ArrayList<>();
		for(Book a:user.getBooks()) {
			 Book books=brepo.findById(a.getId()).get();
			books.add(books);
		}
				user.setBooks(book);
		
		this.repo.save(user);
		
		return user;
	}
	
	//it is use to update the resource on the server
	
	@PutMapping("/")
	public User updateEmployee(@RequestBody User  emp)
	{
		System.err.println(emp);
		repo.save(emp);
		System.err.println(emp);
		return emp;
	}
	
	
	//delete : it is used to delete the resource on the server
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") long id)
	{
		System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}
	
	
}
