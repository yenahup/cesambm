package com.cesam.cesam.entity.sport.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.administration.Bureau;
import com.cesam.cesam.entity.sport.Competition;
import com.cesam.cesam.entity.sport.Winner;

public interface CompetitionRepository extends CrudRepository<Competition, Long>{

	List<Competition> findByBureau(Bureau bureau);
	List<Competition> findByWinner(Winner winner);
	List<Competition> findByDateStartBetween(Date start, Date end);
	List<Competition> findByDateEndBetween(Date start, Date end);
}
