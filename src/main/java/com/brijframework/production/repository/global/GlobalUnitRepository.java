package com.brijframework.production.repository.global;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.global.EOGlobalUnit;

@Repository
@Transactional
public interface GlobalUnitRepository extends JpaRepository<EOGlobalUnit, Long>{
	
	EOGlobalUnit findOneByTypeId(String typeId);

	List<EOGlobalUnit> findAllByUnitGroupId(long unitgroupId);

	EOGlobalUnit findOneByUnitGroupIdAndTypeId(long unitgroupId, String typeId);

}
