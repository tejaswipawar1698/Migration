package org.example.repository.secondary;

import org.example.entity.DocumentKit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryDocumentKitRepository extends JpaRepository<DocumentKit, Long>{

    List<DocumentKit> findByCompanyMstrSeqAndDocumentKitCdAndStatus(Long CompanyMstrSeq, String documentKitCd, Character status);

}
