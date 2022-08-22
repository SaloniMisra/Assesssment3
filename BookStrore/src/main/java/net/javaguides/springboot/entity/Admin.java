package net.javaguides.springboot.entity;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "address")
	private String address;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String Password;
	@OneToMany(cascade=CascadeType.PERSIST)
List<Book>book;
	public Admin() {
		super();
	}

	public Admin(int id, String address, String name, String password) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		Password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", address=" + address + ", name=" + name + ", Password=" + Password + "]";
	}

	public void setBook(List<Book> add) {
		// TODO Auto-generated method stub
		
	}

	 public Book[] getBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
