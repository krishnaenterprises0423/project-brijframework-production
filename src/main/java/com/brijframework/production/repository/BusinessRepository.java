package com.brijframework.production.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.production.entities.EOBusiness;

@Repository
@Transactional
public interface BusinessRepository extends JpaRepository<EOBusiness, Long>{

	@Query(nativeQuery = true , value = " SELECT * FROM EOBUSINESS WHERE VENDOR_ID=?1 AND RECORD_STATUS=1 ")
	Optional<List<EOBusiness>> findByVendorId(Long vendorId);

}
