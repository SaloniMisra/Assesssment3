package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.stereotype.Component;

import net.javaguides.springboot.entity.Signup;

@Component
public interface signinser {
public String signin(Signup s);
public List<Signup> showdet();
public String update(Signup s);
public String delete(long id);
String update1(Signup s);

}