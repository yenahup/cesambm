package com.cesam.cesam.entity.organisation.humain.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.humain.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{

	List<Member> findByFirstNameLikeAndLastNameLikeOrderByFirstNameDesc(String firstName, String lastName);
	List<Member> findByFilliere(String filliere);
	List<Member> findByEtablissement(String etablissement);
	List<Member> findByDateInscription(Date dateInscription);
	List<Member> findByDateInscriptionBetween(Date startDate, Date endDate);
	List<Member> findByCycle(String cycle);
	List<Member> findByMatricule(String matricule);
	Member findByUsername(String username);
	
	

	
}
