package org.example.repository.secondary;

import org.example.entity.FieldGroupMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SecondaryFieldGroupMembersRepository extends JpaRepository<FieldGroupMembers, Long> {

    List<FieldGroupMembers> findByCompanyMstrSeqAndStatus(Long companyMstrSeq, Character status);

    List<FieldGroupMembers> findByCompanyMstrSeqAndFieldKeyAndStatus(Long companyMstrSeq,String fieldKey,Character status);
}
