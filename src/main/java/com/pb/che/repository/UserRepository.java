package com.pb.che.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pb.che.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	
	@Query("select * from t_user where account=? limit 1 ")
	public User getByAccount(String account);
	
	
	@Query("select * from t_user where account=? and hoscode=? limit 1 ")
	public User getByAccount(String account,String hoscode);
	
	
	@Query("select * from t_user where account=? and password=? and  hoscode=? limit 1 ")
	public User getByAccountAndPassword(String account,String password,String  hoscode);
	
	@Modifying()
	@Query("update from t_user set password=?  where account=? and hoscode=? ")
	public void updatePassword(String password ,String account,String hoscode);
	
}
