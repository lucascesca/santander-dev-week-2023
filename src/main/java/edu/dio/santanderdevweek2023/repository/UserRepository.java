package edu.dio.santanderdevweek2023.repository;


import edu.dio.santanderdevweek2023.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //boolean existsByAccountNumber(String accountNumber);
}