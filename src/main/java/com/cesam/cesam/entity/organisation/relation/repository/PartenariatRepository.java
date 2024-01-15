package com.cesam.cesam.entity.organisation.relation.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.relation.Partenariat;

public interface PartenariatRepository extends CrudRepository<Partenariat, Long>{

	List<Partenariat> findByPartenariatType(String type);
	List<Partenariat> findByPartenariatDateBetween(Date start, Date end);
}
