package org.example.repository.primary;

import org.example.entity.CompanyMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryCompanyMstrRepository extends JpaRepository<CompanyMstr,Long> {

    CompanyMstr findByCompanyCd(String companyCd);

}
