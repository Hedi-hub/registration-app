package registrationForm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import registrationForm.models.User;

public interface UserRepository extends JpaRepository <User,Long> {
    User findById(long id);
}
