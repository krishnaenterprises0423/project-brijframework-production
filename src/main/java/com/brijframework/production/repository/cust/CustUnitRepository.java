package com.brijframework.production.repository.cust;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.cust.EOCustUnit;

@Repository
@Transactional
public interface CustUnitRepository extends JpaRepository<EOCustUnit, Long>{

	@Query(nativeQuery = true, value = "select * from EOCUST_UNIT where CUST_PROD_APP_ID= ?1 and NAME=?2")
	Optional<EOCustUnit> findByCustAppAndName(Long id, String name);

}
