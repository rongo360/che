package com.pb.che.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pb.che.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	
	@Query("select * from t_user where account=?  ")
	public User getByAccount(String account);
	
}
