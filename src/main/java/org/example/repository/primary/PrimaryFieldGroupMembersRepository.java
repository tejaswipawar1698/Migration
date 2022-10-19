package org.example.repository.primary;

import org.example.entity.CompanyMstr;
import org.example.entity.FieldGroupMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryFieldGroupMembersRepository extends JpaRepository<FieldGroupMembers, Long> {

    List<FieldGroupMembers> findAllByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);

}
