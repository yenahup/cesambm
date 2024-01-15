package com.cesam.cesam.entity.ressources.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.ressources.Ressource;

public interface RessourceRepository extends CrudRepository<Ressource, Long> {

	List<Ressource> findByTitleRessource(String title);
	List<Ressource> findByTypeRessource(String title);
	List<Ressource> findByDateRessourceBetween(Date start, Date end);
}
