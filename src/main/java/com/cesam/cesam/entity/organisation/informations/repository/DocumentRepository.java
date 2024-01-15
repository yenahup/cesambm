package com.cesam.cesam.entity.organisation.informations.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.administration.Bureau;
import com.cesam.cesam.entity.organisation.informations.Documents;

public interface DocumentRepository extends CrudRepository<Documents, Long>{

	List<Documents> findByDateCreationBetween(Date stratDate, Date endDate);
	List<Documents> findByBureau(Bureau bureau);
}
