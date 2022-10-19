package org.example.repository.secondary;

import org.example.entity.RequestStatusMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecondaryRequestStatusMstrRepository extends JpaRepository<RequestStatusMstr, Long> {

    List<RequestStatusMstr> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);

}
