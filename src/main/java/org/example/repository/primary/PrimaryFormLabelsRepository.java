package org.example.repository.primary;

import org.example.entity.FieldGroupMembers;
import org.example.entity.FormLabels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PrimaryFormLabelsRepository extends JpaRepository<FormLabels, Long> {


    @Query(value = "SELECT * from form_labels fl inner join company_mstr cm on cm .COMPANY_MSTR_SEQ =fl .COMPANY_MSTR_SEQ \n" +
            "WHERE cm .COMPANY_MSTR_SEQ =?1",nativeQuery = true)
    List<FormLabels> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, char status);

}
