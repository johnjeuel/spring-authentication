package code.jeuel.springauthentication.services;

import code.jeuel.springauthentication.models.Role;
import code.jeuel.springauthentication.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
