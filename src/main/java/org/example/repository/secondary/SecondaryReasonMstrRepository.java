package org.example.repository.secondary;

import org.example.entity.ReasonMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by suyog on 5/6/20.
 */
@Repository
public interface SecondaryReasonMstrRepository extends JpaRepository<ReasonMstr, Long>{


    List<ReasonMstr> findByCompanyMstrSeqAndTypeAndStatus(Long companyMstrSeq,String type,Character status);
}
