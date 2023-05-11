package vn.smarthomeapiadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.smarthomeapiadmin.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
    User findById(String id);
    void deleteById(String id);

    User findByUsername(String username);

}
