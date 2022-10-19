package org.example.repository.primary;

import org.example.entity.ReasonMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by suyog on 5/6/20.
 */
@Repository
public interface PrimaryReasonMstrRepository extends JpaRepository<ReasonMstr, Long>{

   List<ReasonMstr> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);
}
