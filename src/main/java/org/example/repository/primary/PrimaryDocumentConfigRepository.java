package org.example.repository.primary;

import org.example.entity.DocumentConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryDocumentConfigRepository extends JpaRepository <DocumentConfig, Long>{

    List<DocumentConfig> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);


    DocumentConfig findDocumentConfigByCompanyMstrSeqAndDocumentCategoryAndStatus(Long companyMstrSeq,String documentCategory, Character status);

}
