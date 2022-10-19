package org.example.repository.primary;

import org.example.entity.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryCompanyInfoRepository extends JpaRepository<CompanyInfo, Long> {

    List<CompanyInfo> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
