package code.jeuel.springauthentication.dao;

import code.jeuel.springauthentication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
