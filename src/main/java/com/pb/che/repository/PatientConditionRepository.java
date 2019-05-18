package com.pb.che.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pb.che.entity.PatientCondition;

@Repository
public interface PatientConditionRepository extends JpaRepository<PatientCondition, Integer>
{

	

	
}
