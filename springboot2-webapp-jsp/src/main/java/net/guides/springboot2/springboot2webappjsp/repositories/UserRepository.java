package net.guides.springboot2.springboot2webappjsp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.guides.springboot2.springboot2webappjsp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public List<User> findUserByName(String name);
	
	@Query("select u from User u where u.id = :id")
	public List<User> buscaPorId(@Param("id")  Integer id);
	
}
