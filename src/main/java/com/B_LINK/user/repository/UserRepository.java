package com.B_LINK.user.repository;

import com.B_LINK.user.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{userName :  ?0}")
    User findByUsername(String username);

}
