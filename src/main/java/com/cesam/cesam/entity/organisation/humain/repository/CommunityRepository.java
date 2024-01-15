package com.cesam.cesam.entity.organisation.humain.repository;



import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.humain.Community;


public interface CommunityRepository extends CrudRepository<Community, Long> {


	List<Community> findByBelongDateBetween(Date startDate, Date endDate);
	List<Community> findByCommunityNameLike(String communityName);
	
}
