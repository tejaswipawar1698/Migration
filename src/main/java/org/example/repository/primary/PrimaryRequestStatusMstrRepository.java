package org.example.repository.primary;

import org.example.entity.RequestStatusMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrimaryRequestStatusMstrRepository extends JpaRepository<RequestStatusMstr, Long> {

    List<RequestStatusMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);


}
