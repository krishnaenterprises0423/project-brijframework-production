package com.brijframework.production.repository.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.global.EOGlobalUnitGroup;

@Repository
@Transactional
public interface GlobalUnitGroupRepository extends JpaRepository<EOGlobalUnitGroup, Long>{
	
	EOGlobalUnitGroup findOneByTypeId(String typeId);

	EOGlobalUnitGroup findAllByTypeId(String typeId);

}
