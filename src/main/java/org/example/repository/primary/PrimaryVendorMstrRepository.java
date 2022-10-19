package org.example.repository.primary;

import org.example.entity.VendorMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryVendorMstrRepository extends JpaRepository<VendorMstr,Integer> {

    List<VendorMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
