package org.example.repository.primary;

import org.example.entity.FieldMemberPersistMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryFieldMemberPersistMstrRepository extends JpaRepository<FieldMemberPersistMstr, Long> {


    @Query(value = "SELECT * FROM field_member_persist_mstr fmpm inner join field_group_members fgm on fgm .FIELD_GROUP_MEMBER_SEQ =fmpm .FIELD_GROUP_MEMBER_SEQ \n" +
            "inner join company_mstr cm on cm.COMPANY_MSTR_SEQ =fmpm .COMPANY_MSTR_SEQ \n" +
            "where cm .COMPANY_MSTR_SEQ =?1 and fmpm.STATUS='A'" +
            "order by fmpm.FIELD_GROUP_MEMBER_SEQ",nativeQuery = true)
    List<FieldMemberPersistMstr> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, char status);
}
