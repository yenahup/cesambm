package com.cesam.cesam.entity.organisation.administration.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cesam.cesam.entity.organisation.administration.Bureau;

public interface BureauRepository extends CrudRepository<Bureau, Long> {

	List<Bureau> findByBureauIdAndResponsabilityIdAndMemberId(Long bureauId, Long responsabilityId, Long memberId);
	Optional<Bureau> findByIsCurrent(boolean isCurrent);
	
	
}
