package org.example.repository.secondary;

import org.example.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SecondaryUserRoleRepository extends JpaRepository<UserRole,Long> {

    List<UserRole> findByCompanyMstrSeqAndStatus(Long companyMstrSeq,Character status);


}
