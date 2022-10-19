package org.example.repository.secondary;


import org.example.entity.FormLabels;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryFormLabelsRepository extends CrudRepository<FormLabels, Long> {


    List<FormLabels> findByCompanyMstrSeqAndLabelAndStatus(Long companyMstrSeq,String label,Character status);
}
