package net.javaguides.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.javaguides.springboot.entity.Signup;
import net.javaguides.springboot.repo.signinRepo;
import net.javaguides.springboot.service.signinser;

@Component
public class SigninImpl implements signinser{
@Autowired
signinRepo repo;

public String signin1(Signup s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Signin Successfull";
}

@Override
public List<Signup> showdet() {
	// TODO Auto-generated method stub
	return repo.findAll();
}

@Override
public String update(Signup s) {
	// TODO Auto-generated method stub
	repo.save(s);
	return "Update Successfull";
}

@Override
public String delete(long id) {
	// TODO Auto-generated method stub
	repo.deleteById(id);
	return "Data deleted";
}

@Override
public String signin(Signup s) {
	// TODO Auto-generated method stub
	return null;
}

public List<Signup> showdet1() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String update1(Signup s) {
	// TODO Auto-generated method stub
	return null;
}
	
}
