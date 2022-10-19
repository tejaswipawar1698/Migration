package org.example.repository.primary;


import org.example.entity.RequestTransitionMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrimaryRequestTransitionMstrRepository extends JpaRepository<RequestTransitionMstr, Long> {

   List<RequestTransitionMstr> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);
}
