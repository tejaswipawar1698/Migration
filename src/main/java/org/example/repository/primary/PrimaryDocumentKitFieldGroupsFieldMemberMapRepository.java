package org.example.repository.primary;

import org.example.entity.DocumentKitFieldGroupsFieldMemberMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryDocumentKitFieldGroupsFieldMemberMapRepository extends JpaRepository<DocumentKitFieldGroupsFieldMemberMap, Long> {

    @Query(value = "SELECT * FROM document_kit_field_groups_field_member_map dkfgfmm inner join document_kit_field_groups dkfg ON dkfg .DOCUMENT_KIT_FIELD_GROUP_SEQ =dkfgfmm .DOCUMENT_KIT_FIELD_GROUP_SEQ \n" +
            "inner join field_group_members fgm on fgm.FIELD_GROUP_MEMBER_SEQ =dkfgfmm .FIELD_GROUP_MEMBER_SEQ \n" +
            "where dkfgfmm .COMPANY_MSTR_SEQ =(SELECT COMPANY_MSTR_SEQ from company_mstr cm where cm .COMPANY_CD =?1)",nativeQuery = true)
    List<DocumentKitFieldGroupsFieldMemberMap> findByCompanyMstrSeqAndStatus(String companyCd, Character status);

}
