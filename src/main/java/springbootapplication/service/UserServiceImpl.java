package springbootapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootapplication.entity.User;
import springbootapplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	//Con el Autowired le decimos a Spring que se encargue de traernos ese recurso
	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
