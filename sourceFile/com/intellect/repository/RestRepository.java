package com.intellect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intellect.model.User;

public interface RestRepository extends JpaRepository<User, String>{

	User create(User user);

	User update(User user, String id);

	void delete(String id);
}
