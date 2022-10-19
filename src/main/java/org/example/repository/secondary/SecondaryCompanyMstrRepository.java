package org.example.repository.secondary;

import org.example.entity.CompanyMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryCompanyMstrRepository extends JpaRepository<CompanyMstr,Long> {

    CompanyMstr findByCompanyCd(String companyCd);

}
