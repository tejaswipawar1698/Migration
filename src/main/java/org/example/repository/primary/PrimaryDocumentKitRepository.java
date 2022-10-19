package org.example.repository.primary;

import org.example.entity.DocumentKit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryDocumentKitRepository extends JpaRepository<DocumentKit, Long>{

    List<DocumentKit> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);

    DocumentKit findByCompanyMstrSeqAndDocumentKitCdAndStatus(Long companyMstrSeq, String documentKidCd,Character status);
}
