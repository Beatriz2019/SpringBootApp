package springbootapplication.service;

import springbootapplication.entity.User;

public interface UserService {

	//un iterable puede ser cualquier colección, una lista, array, etc, puede ser cualquier tipo de dato
	public Iterable<User> getAllUsers();
}
