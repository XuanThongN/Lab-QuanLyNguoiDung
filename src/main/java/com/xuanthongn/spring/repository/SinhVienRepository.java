package com.xuanthongn.spring.repository;

import com.xuanthongn.spring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepository extends JpaRepository<User, Long> {


}
