package org.example.repository.primary;

import org.example.entity.ValidatorsMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryValidatorsMstrRepository extends JpaRepository<ValidatorsMstr, Long>{

    List<ValidatorsMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);

}
