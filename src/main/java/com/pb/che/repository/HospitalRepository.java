package com.pb.che.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.pb.che.entity.Hospital;

@Service
public interface HospitalRepository extends JpaRepository<Hospital ,Integer>
{ 


	@Query("select * from t_hospital where hoscode=? limit 1")
	public  Hospital getByHosode(String hoscode);
	
	
}
