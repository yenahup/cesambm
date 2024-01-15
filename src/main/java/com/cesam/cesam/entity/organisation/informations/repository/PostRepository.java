package com.cesam.cesam.entity.organisation.informations.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.informations.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
	
	List<Post> findByDatePostBetween(Date statDate, Date endDate);
	
}
