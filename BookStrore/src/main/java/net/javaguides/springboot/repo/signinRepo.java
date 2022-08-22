package net.javaguides.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Signup;

public interface signinRepo extends JpaRepository<Signup, Long> {

}