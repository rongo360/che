package com.pb.che.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pb.che.entity.PatientCureDetail;

@Repository
public interface PatientCureDetailRepository extends JpaRepository<PatientCureDetail,
Integer>
{

	
	
}
