package zw.co.afrosoft.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    //@Query("SELECT u FROM User u WHERE u.username = :username") we would use this if it was extending Crud repository
     User findByUsername(String username);
}
