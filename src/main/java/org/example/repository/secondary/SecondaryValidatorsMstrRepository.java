package org.example.repository.secondary;

import org.example.entity.ValidatorsMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryValidatorsMstrRepository extends JpaRepository<ValidatorsMstr, Long>{

    List<ValidatorsMstr> findByCompanyMstrSeqAndValidationAndStatus(Long companyMstrSeq, String validation, Character status);

}
