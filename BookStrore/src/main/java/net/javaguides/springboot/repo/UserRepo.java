package net.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.User;


public interface UserRepo extends JpaRepository<User, Long>{

}
