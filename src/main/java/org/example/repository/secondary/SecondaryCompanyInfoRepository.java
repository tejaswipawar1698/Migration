package org.example.repository.secondary;

import org.example.entity.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryCompanyInfoRepository extends JpaRepository<CompanyInfo, Long> {

    CompanyInfo findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
