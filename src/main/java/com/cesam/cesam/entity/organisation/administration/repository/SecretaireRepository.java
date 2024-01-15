package com.cesam.cesam.entity.organisation.administration.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.administration.Secretaire;
import com.cesam.cesam.entity.organisation.humain.Community;

public interface SecretaireRepository extends CrudRepository<Secretaire, Long>{

	List<Secretaire> findByCommunity(Community community);
}
