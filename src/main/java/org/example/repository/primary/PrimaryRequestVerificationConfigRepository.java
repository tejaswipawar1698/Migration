package org.example.repository.primary;

import org.example.entity.RequestVerificationConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrimaryRequestVerificationConfigRepository extends JpaRepository<RequestVerificationConfig, Long> {

    List<RequestVerificationConfig> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);
}
