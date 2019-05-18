package com.pb.che.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pb.che.entity.PatientCureDetail;

@Repository
public interface PatientCureDetailRepository extends JpaRepository<PatientCureDetail,
Integer>
{

	@Query("select * from t_patientcuredetail where pcid=? and hoscode=?")
	public List<PatientCureDetail> getListsByPcid(String pcid,String hoscode);
	
}
