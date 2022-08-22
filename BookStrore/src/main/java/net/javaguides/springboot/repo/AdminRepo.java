package net.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	void deleteById(long id);

}
