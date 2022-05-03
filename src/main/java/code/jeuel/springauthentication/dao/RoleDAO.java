package code.jeuel.springauthentication.dao;

import code.jeuel.springauthentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
