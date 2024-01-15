package com.cesam.cesam.entity.organisation.informations.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.humain.Member;
import com.cesam.cesam.entity.organisation.informations.Laureat;

public interface LaureatRepository extends CrudRepository<Laureat, Long> {

	List<Laureat> findByDateLaureatBetween(Date statDate, Date endDate);
	List<Laureat> findByMember(Member member);
	List<Laureat> findByCycleLaureat(String cycle);
	List<Laureat> findByFilliereLaureat(String filliere);
	
}
