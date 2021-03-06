package ie.demo.service.impl;

import org.springframework.stereotype.Service;

import ie.demo.domain.User;
import ie.demo.service.UserFactory;

@Service
public class CustomerFactory implements UserFactory {

	@Override
	public User createUser(String username, String password, long studentCardId, String email) {
		return new User(username, password, studentCardId, email, 1);
	}

}
