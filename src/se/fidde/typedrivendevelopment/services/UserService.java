package se.fidde.typedrivendevelopment.services;

import java.util.UUID;

import se.fidde.typedrivendevelopment.models.User;

public class UserService {
	public static User getUser(UUID id) {
		return new User("foo@bar.se");
	}
}
