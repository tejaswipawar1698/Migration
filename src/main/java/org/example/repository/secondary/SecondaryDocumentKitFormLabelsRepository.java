package org.example.repository.secondary;


import org.example.entity.DocumentKitFormLabels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryDocumentKitFormLabelsRepository extends CrudRepository<DocumentKitFormLabels, Long> {

    List<DocumentKitFormLabels> findByDocumentKitLabelSeqAndStatus(Long documentKitLabelSeq, Character status);

}
