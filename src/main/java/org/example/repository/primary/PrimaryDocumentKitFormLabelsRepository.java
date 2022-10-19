package org.example.repository.primary;

import org.example.entity.DocumentKitFormLabels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryDocumentKitFormLabelsRepository extends CrudRepository<DocumentKitFormLabels, Long> {

    @Query(value = "SELECT * FROM document_kit_form_labels dkfl inner join document_kit dk on dk.DOCUMENT_KIT_SEQ =dkfl .DOCUMENT_KIT_SEQ \n" +
            "inner join form_labels fl on fl .FORM_LABEL_SEQ =dkfl .FORM_LABEL_SEQ \n" +
            "where dkfl .COMPANY_MSTR_SEQ =?1",nativeQuery = true)
    List<DocumentKitFormLabels> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);



}
