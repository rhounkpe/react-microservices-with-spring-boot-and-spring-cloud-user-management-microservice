package be.digitcom.user.management.microservice.repository;

import be.digitcom.user.management.microservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query("SELECT u.name FROM User u WHERE u.id IN (:pIdList)")
    List<String> findUserNames(@Param("pIdList") List<Long> idList);
}
