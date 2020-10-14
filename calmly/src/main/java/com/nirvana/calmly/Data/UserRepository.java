package com.nirvana.calmly.Data;

import com.nirvana.calmly.Users.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUserName(String username);
    User findByEmail(String email);
}
