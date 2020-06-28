package me.weitao.spring.docs.dao;

import me.weitao.spring.docs.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Watony Weng
 * @date 2020/06/28
 */

public interface UserRepository extends JpaRepository<User, Long> {

  User findByName(String name);

  User findByNameAndAge(String name, Integer age);

  @Query("from User u where u.name=:name")
  User findUser(@Param("name") String name);

}
