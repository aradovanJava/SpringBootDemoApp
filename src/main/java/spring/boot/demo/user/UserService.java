package spring.boot.demo.user;

import java.util.Optional;

public interface UserService {
    Optional<UserDTO> findByUsername(String username);
}
