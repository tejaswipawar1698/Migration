package org.example.repository.primary;

import org.example.entity.ReasonMstrTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryReasonMstrTranslationRepository extends JpaRepository<ReasonMstrTranslation, Long>{

    List<ReasonMstrTranslation> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
