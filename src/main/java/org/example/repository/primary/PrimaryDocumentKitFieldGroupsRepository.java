package org.example.repository.primary;

import org.example.entity.DocumentKitFieldGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryDocumentKitFieldGroupsRepository extends JpaRepository<DocumentKitFieldGroups, Long> {

    @Query(value = "SELECT * from document_kit_field_groups dkfg inner join document_kit_form_labels dkfl on dkfl .DOCUMENT_KIT_LABEL_SEQ =dkfg .DOCUMENT_KIT_LABEL_SEQ \n" +
            "where dkfg .COMPANY_MSTR_SEQ=?1",nativeQuery = true)
    List<DocumentKitFieldGroups> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);


}
