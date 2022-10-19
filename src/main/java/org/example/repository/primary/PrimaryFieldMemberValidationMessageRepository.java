package org.example.repository.primary;


import org.example.entity.FieldMemberValidationMessageMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryFieldMemberValidationMessageRepository extends JpaRepository<FieldMemberValidationMessageMap, Long> {

    List<FieldMemberValidationMessageMap> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);

}
