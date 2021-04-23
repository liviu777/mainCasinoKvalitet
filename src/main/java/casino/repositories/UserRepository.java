package casino.repositories;

import casino.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // defineste un bean
public interface UserRepository extends JpaRepository<User,Long> {

  User findUserByUsername(String username);

}
